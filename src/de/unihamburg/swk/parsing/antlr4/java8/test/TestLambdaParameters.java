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
public class TestLambdaParameters {

	private static final Type DECLARATION = Type.lambdaExpression;
	
	private static String lambda1 = "() -> x";
	private static String lambda2 = "a -> x";
	private static String lambda3 = "(Integer i) -> x";
	private static String lambda4 = "(List<Integer> list) -> x";
	private static String lambda5 = "(a, b) -> x";
	private static String lambda6 = "(i) -> { int j = 1; return i + j;}";
	
	private JavaTestParser<LuceneDocument> jtp = new JavaTestParser<>(new LuceneDocsFactory());
	
	@Test
	public void testClass1() {
		List<LuceneDocument> docs = jtp.parseDocuments(lambda1, DECLARATION);
		
		assertEquals(null, docs.get(0).getContents());
	}

	@Test
	public void testClass2() {
		List<LuceneDocument> docs = jtp.parseDocuments(lambda2, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(TermFactors.OWN_PARAMETER_FACTOR, "a")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
	@Test
	public void testClass3() {
		List<LuceneDocument> docs = jtp.parseDocuments(lambda3, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(TermFactors.OWN_PARAMETER_FACTOR, "i")
				.append(TermFactors.OWN_PARAMETER_TYPE_FACTOR, "Integer")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
	@Test
	public void testClass4() {
		List<LuceneDocument> docs = jtp.parseDocuments(lambda4, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(TermFactors.OWN_PARAMETER_FACTOR, "list")
				.append(TermFactors.OWN_PARAMETER_TYPE_FACTOR, "List")
				.append(TermFactors.OWN_PARAMETER_TYPE_FACTOR, "Integer")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
	@Test
	public void testClass5() {
		List<LuceneDocument> docs = jtp.parseDocuments(lambda5, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(TermFactors.OWN_PARAMETER_FACTOR, "a")
				.append(TermFactors.OWN_PARAMETER_FACTOR, "b")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
	@Test
	public void testClass6() {
		List<LuceneDocument> docs = jtp.parseDocuments(lambda6, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(TermFactors.OWN_PARAMETER_FACTOR, "i")
				.append(TermFactors.OWN_LOCAL_VARIABLE_FACTOR, "j")
				.append(TermFactors.OWN_LOCAL_VARIABLE_TYPE_FACTOR, "int")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
}
