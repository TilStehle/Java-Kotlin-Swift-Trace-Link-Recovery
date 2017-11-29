package de.unihamburg.swk.parsing.antlr4.swift3.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import de.unihamburg.swk.parsing.antlr4.java8.test.ExpectedTermsBuilder;
import de.unihamburg.swk.parsing.antlr4.swift3.test.SwiftTestParser.Type;
import de.unihamburg.swk.parsing.document.TermFactors;
import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneDocsFactory;
import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneDocument;

/**
 * @author Jakob Andersen
 */
public class TestMethodDeclaration {

	private static final Type DECLARATION = Type.functionDeclaration;
	
	private static String method1 = "func ==() {}";
	private static String method2 = "func foo() -> Int {return 0;}";
	private static String method3 = "func foo(in1:Int, out2 in1:Int) {}";
	private static String method4 = "func foo(list:List<String>) -> List<Int> { return x; }";
	private static String method5 = "func foo<A, B>() {}";
	
	private SwiftTestParser<LuceneDocument> jtp = new SwiftTestParser<>(new LuceneDocsFactory());
	
	@Test
	public void testMethod1() {
		List<LuceneDocument> docs = jtp.parseDocuments(method1, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(TermFactors.OWN_METHOD_FACTOR, "==")
				.append(TermFactors.OWN_METHOD_TYPE_FACTOR, "void")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}

	@Test
	public void testMethod2() {
		List<LuceneDocument> docs = jtp.parseDocuments(method2, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(TermFactors.OWN_METHOD_FACTOR, "foo")
				.append(TermFactors.OWN_METHOD_TYPE_FACTOR, "Int")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
	@Test
	public void testMethod3() {
		List<LuceneDocument> docs = jtp.parseDocuments(method3, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(TermFactors.OWN_METHOD_FACTOR, "foo")
				.append(TermFactors.OWN_METHOD_TYPE_FACTOR, "void")
				.append(TermFactors.OWN_PARAMETER_FACTOR, "in1")
				.append(TermFactors.OWN_PARAMETER_TYPE_FACTOR, "Int")
				.append(TermFactors.OWN_PARAMETER_FACTOR, "out2")
				.append(TermFactors.OWN_PARAMETER_TYPE_FACTOR, "Int")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
	@Test
	public void testMethod4() {
		List<LuceneDocument> docs = jtp.parseDocuments(method4, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(TermFactors.OWN_METHOD_FACTOR, "foo")
				.append(TermFactors.OWN_METHOD_TYPE_FACTOR, "List")
				.append(TermFactors.OWN_METHOD_TYPE_FACTOR, "Int")
				.append(TermFactors.OWN_PARAMETER_FACTOR, "list")
				.append(TermFactors.OWN_PARAMETER_TYPE_FACTOR, "List")
				.append(TermFactors.OWN_PARAMETER_TYPE_FACTOR, "String")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
	@Test
	public void testMethod5() {
		List<LuceneDocument> docs = jtp.parseDocuments(method5, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(TermFactors.OWN_METHOD_FACTOR, "foo")
				.append(TermFactors.OWN_METHOD_TYPE_FACTOR, "void")
				.append(TermFactors.OWN_TYPE_PARAMETER_FACTOR, "A")
				.append(TermFactors.OWN_TYPE_PARAMETER_FACTOR, "B")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
}
