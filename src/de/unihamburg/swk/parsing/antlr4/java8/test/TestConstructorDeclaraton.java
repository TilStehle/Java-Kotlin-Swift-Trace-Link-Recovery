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
public class TestConstructorDeclaraton {

	private static final Type DECLARATION = Type.constructorDeclaration;
	
	private static String constructor1 = "Clazz() {}";
	private static String constructor2 = "Clazz(int a, int b) {}";
	private static String constructor3 = "Clazz(List<String> list) {}";
	
	private JavaTestParser<LuceneDocument> jtp = new JavaTestParser<>(new LuceneDocsFactory());
	TermFactors termFactors = TermFactors.DEFAULT_FACTORS;
	@Test
	public void testConstructor1() {
		List<LuceneDocument> docs = jtp.parseDocuments(constructor1, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb.append(termFactors.ownConstructorFactor, "Clazz").toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}

	@Test
	public void testConstructor2() {
		List<LuceneDocument> docs = jtp.parseDocuments(constructor2, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(termFactors.ownConstructorFactor, "Clazz")
				.append(termFactors.ownParameterFactor, "a")
				.append(termFactors.ownParameterTypeFactor, "int")
				.append(termFactors.ownParameterFactor, "b")
				.append(termFactors.ownParameterTypeFactor, "int")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
	@Test
	public void testConstructor3() {
		List<LuceneDocument> docs = jtp.parseDocuments(constructor3, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(termFactors.ownConstructorFactor, "Clazz")
				.append(termFactors.ownParameterFactor, "list")
				.append(termFactors.ownParameterTypeFactor, "List")
				.append(termFactors.ownParameterTypeFactor, "String")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}

}