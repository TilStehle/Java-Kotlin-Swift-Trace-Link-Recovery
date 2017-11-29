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
public class TestInterfaceDeclaration {

	private static final Type DECLARATION = Type.normalInterfaceDeclaration;
	private static String interface1 = "interface I { }";
	private static String interface2 = "interface I extends A, B {}";
	private static String interface3 = "interface I<T> {}";
	
	private JavaTestParser<LuceneDocument> jtp = new JavaTestParser<>(new LuceneDocsFactory());
	
	@Test
	public void testClass1() {
		List<LuceneDocument> docs = jtp.parseDocuments(interface1, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(TermFactors.OWN_TYPE_DECLARATION_FACTOR, "I")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}

	@Test
	public void testClass2() {
		List<LuceneDocument> docs = jtp.parseDocuments(interface2, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(TermFactors.OWN_TYPE_DECLARATION_FACTOR, "I")
				.append(TermFactors.OWN_INHERITANCE_FACTOR, "A")
				.append(TermFactors.OWN_INHERITANCE_FACTOR, "B")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
	@Test
	public void testClass3() {
		List<LuceneDocument> docs = jtp.parseDocuments(interface3, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(TermFactors.OWN_TYPE_DECLARATION_FACTOR, "I")
				.append(TermFactors.OWN_TYPE_PARAMETER_FACTOR, "T")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
	
}
