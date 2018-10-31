package de.unihamburg.swk.parsing.antlr4.java8.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import de.unihamburg.swk.parsing.antlr4.java8.test.JavaTestParser.Type;
import de.unihamburg.swk.parsing.document.TermFactors;
import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneDocsFactory;
import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneDocument;

/**
 * @author Jakob Andersen
 */
public class TestEnumDeclaration {

	private static final Type DECLARATION = Type.enumDeclaration;
	
	private static String enum1 = "enum E {}";
	private static String enum2 = "enum E { INSTANCE1, INSTANCE2 }";
	private static String enum3 = "enum E implements I, J { }";
	private TermFactors termFactors = TermFactors.DEFAULT_FACTORS;
	
	private JavaTestParser<LuceneDocument> jtp = new JavaTestParser<>(new LuceneDocsFactory());
	
	@Test
	public void testEnum1() {
		List<LuceneDocument> docs = jtp.parseDocuments(enum1, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(termFactors.ownTypeDeclarationFactor, "E")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}

	@Test
	public void testEnum2() {
		List<LuceneDocument> docs = jtp.parseDocuments(enum2, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(termFactors.ownTypeDeclarationFactor, "E")
				.append(termFactors.ownAttributeFactor, "INSTANCE1")
				.append(termFactors.ownAttributeFactor, "INSTANCE2")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
	@Test
	public void testEnum3() {
		List<LuceneDocument> docs = jtp.parseDocuments(enum3, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(termFactors.ownTypeDeclarationFactor, "E")
				.append(termFactors.ownInheritanceFactor, "I")
				.append(termFactors.ownInheritanceFactor, "J")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
}
