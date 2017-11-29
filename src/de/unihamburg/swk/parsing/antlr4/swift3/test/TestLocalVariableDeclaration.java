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
public class TestLocalVariableDeclaration {

	private static final Type DECLARATION = Type.functionDeclaration;
	
	private static String localVariable1 = "func foo() { var i: Int = 10; }";
	private static String localVariable2 = "func foo() { var i, j }";
	private static String localVariable3 = "func foo() { var s:[String] }";
	private static String localVariable4 = "func foo() { var list:List<A<B>> }";
	private static String localVariable5 = "func foo() { var mustBeSettable: Int { get {} set {} }; }";
	
	private SwiftTestParser<LuceneDocument> jtp = new SwiftTestParser<>(new LuceneDocsFactory());
	
	@Test
	public void testLocalVariable1() {
		List<LuceneDocument> docs = jtp.parseDocuments(localVariable1, DECLARATION);

		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(TermFactors.OWN_METHOD_FACTOR, "foo")
				.append(TermFactors.OWN_METHOD_TYPE_FACTOR, "void")
				
				.append(TermFactors.OWN_LOCAL_VARIABLE_FACTOR, "i")
				.append(TermFactors.OWN_LOCAL_VARIABLE_TYPE_FACTOR, "Int")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
	@Test
	public void testLocalVariable2() {
		List<LuceneDocument> docs = jtp.parseDocuments(localVariable2, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(TermFactors.OWN_METHOD_FACTOR, "foo")
				.append(TermFactors.OWN_METHOD_TYPE_FACTOR, "void")
				
				.append(TermFactors.OWN_LOCAL_VARIABLE_FACTOR, "i")
				.append(TermFactors.OWN_LOCAL_VARIABLE_FACTOR, "j")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
	@Test
	public void testLocalVariable3() {
		List<LuceneDocument> docs = jtp.parseDocuments(localVariable3, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(TermFactors.OWN_METHOD_FACTOR, "foo")
				.append(TermFactors.OWN_METHOD_TYPE_FACTOR, "void")
				
				.append(TermFactors.OWN_LOCAL_VARIABLE_FACTOR, "s")
				.append(TermFactors.OWN_LOCAL_VARIABLE_TYPE_FACTOR, "String")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
	@Test
	public void testLocalVariable4() {
		List<LuceneDocument> docs = jtp.parseDocuments(localVariable4, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(TermFactors.OWN_METHOD_FACTOR, "foo")
				.append(TermFactors.OWN_METHOD_TYPE_FACTOR, "void")
				
				.append(TermFactors.OWN_LOCAL_VARIABLE_FACTOR, "list")
				.append(TermFactors.OWN_LOCAL_VARIABLE_TYPE_FACTOR, "List")
				.append(TermFactors.OWN_LOCAL_VARIABLE_TYPE_FACTOR, "A")
				.append(TermFactors.OWN_LOCAL_VARIABLE_TYPE_FACTOR, "B")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
	@Test
	public void testLocalVariable5() {
		List<LuceneDocument> docs = jtp.parseDocuments(localVariable5, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(TermFactors.OWN_METHOD_FACTOR, "foo")
				.append(TermFactors.OWN_METHOD_TYPE_FACTOR, "void")
				
				.append(TermFactors.OWN_LOCAL_VARIABLE_FACTOR, "mustBeSettable")
				.append(TermFactors.OWN_LOCAL_VARIABLE_TYPE_FACTOR, "Int")
				
				.append(1, "get")
				.append(1, "set")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
}
