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
public class TestMethodDeclaration {

	private static final Type DECLARATION = Type.methodDeclaration;
	
	private static String method1 = "void foo() {}";
	private static String method2 = "int foo() {return 0;}";
	private static String method3 = "void foo(int a, int b) {}";
	private static String method4 = "List<A<B>> foo(List<String> list) { return x; }";
	private static String method5 = "<A, B> void foo() {}";
	private static TermFactors termFactors = TermFactors.DEFAULT_FACTORS;
	
	private JavaTestParser<LuceneDocument> jtp = new JavaTestParser<>(new LuceneDocsFactory());
	
	@Test
	public void testMethod1() {
		List<LuceneDocument> docs = jtp.parseDocuments(method1, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(termFactors.ownMethodFactor, "foo")
				.append(termFactors.ownMethodTypeFactor, "void")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}

	@Test
	public void testMethod2() {
		List<LuceneDocument> docs = jtp.parseDocuments(method2, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(termFactors.ownMethodFactor, "foo")
				.append(termFactors.ownMethodTypeFactor, "int")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
	@Test
	public void testMethod3() {
		List<LuceneDocument> docs = jtp.parseDocuments(method3, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(termFactors.ownMethodFactor, "foo")
				.append(termFactors.ownMethodTypeFactor, "void")
				.append(termFactors.ownParameterFactor, "a")
				.append(termFactors.ownParameterTypeFactor, "int")
				.append(termFactors.ownParameterFactor, "b")
				.append(termFactors.ownParameterTypeFactor, "int")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
	@Test
	public void testMethod4() {
		List<LuceneDocument> docs = jtp.parseDocuments(method4, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(termFactors.ownMethodFactor, "foo")
				.append(termFactors.ownMethodTypeFactor, "List")
				.append(termFactors.ownMethodTypeFactor, "A")
				.append(termFactors.ownMethodTypeFactor, "B")
				.append(termFactors.ownParameterFactor, "list")
				.append(termFactors.ownParameterTypeFactor, "List")
				.append(termFactors.ownParameterTypeFactor, "String")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
	@Test
	public void testMethod5() {
		List<LuceneDocument> docs = jtp.parseDocuments(method5, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(termFactors.ownMethodFactor, "foo")
				.append(termFactors.ownMethodTypeFactor, "void")
				.append(termFactors.ownTypeParameterFactor, "A")
				.append(termFactors.ownTypeParameterFactor, "B")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
}
