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
public class TestProtocolMethodDeclaration {

	private static final Type DECLARATION = Type.protocolMethodDeclaration;
	
	private static String method1 = "func foo()";
	private static String method2 = "func foo() -> Int";
	private static String method3 = "func foo(a:Int, b:Int)";
	private static String method4 = "func foo(list:List<String>)";
	private static String method5 = "func foo<A, B>()";
	private TermFactors termFactors = TermFactors.DEFAULT_FACTORS;
	// TODO return
	
	private SwiftTestParser<LuceneDocument> jtp = new SwiftTestParser<>(new LuceneDocsFactory());
	
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
				.append(termFactors.ownMethodTypeFactor, "Int")
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
				.append(termFactors.ownParameterTypeFactor, "Int")
				.append(termFactors.ownParameterFactor, "b")
				.append(termFactors.ownParameterTypeFactor, "Int")
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
				.append(termFactors.ownMethodTypeFactor, "void")
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
