package de.unihamburg.swk.parsing.antlr4.swift3.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import de.unihamburg.swk.parsing.document.TermFactor;
import de.unihamburg.swk.parsing.document.TermFactors;
import org.junit.Test;

import de.unihamburg.swk.parsing.antlr4.java8.test.ExpectedTermsBuilder;
import de.unihamburg.swk.parsing.antlr4.swift3.test.SwiftTestParser.Type;
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

	private static TermFactors termFactors = TermFactors.DEFAULT_FACTORS;
	private SwiftTestParser<LuceneDocument> jtp = new SwiftTestParser<>(new LuceneDocsFactory());
	
	@Test
	public void testLocalVariable1() {
		List<LuceneDocument> docs = jtp.parseDocuments(localVariable1, DECLARATION);

		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(termFactors.ownMethodFactor, "foo")
				.append(termFactors.ownMethodTypeFactor, "void")
				
				.append(termFactors.ownLocalVariableFactor, "i")
				.append(termFactors.ownLocalVariableTypeFactor, "Int")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
	@Test
	public void testLocalVariable2() {
		List<LuceneDocument> docs = jtp.parseDocuments(localVariable2, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(termFactors.ownMethodFactor, "foo")
				.append(termFactors.ownMethodTypeFactor, "void")
				
				.append(termFactors.ownLocalVariableFactor, "i")
				.append(termFactors.ownLocalVariableFactor, "j")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
	@Test
	public void testLocalVariable3() {
		List<LuceneDocument> docs = jtp.parseDocuments(localVariable3, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(termFactors.ownMethodFactor, "foo")
				.append(termFactors.ownMethodTypeFactor, "void")
				
				.append(termFactors.ownLocalVariableFactor, "s")
				.append(termFactors.ownLocalVariableTypeFactor, "String")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
	@Test
	public void testLocalVariable4() {
		List<LuceneDocument> docs = jtp.parseDocuments(localVariable4, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(termFactors.ownMethodFactor, "foo")
				.append(termFactors.ownMethodTypeFactor, "void")
				
				.append(termFactors.ownLocalVariableFactor, "list")
				.append(termFactors.ownLocalVariableTypeFactor, "List")
				.append(termFactors.ownLocalVariableTypeFactor, "A")
				.append(termFactors.ownLocalVariableTypeFactor, "B")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
	@Test
	public void testLocalVariable5() {
		List<LuceneDocument> docs = jtp.parseDocuments(localVariable5, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(termFactors.ownMethodFactor, "foo")
				.append(termFactors.ownMethodTypeFactor, "void")
				
				.append(termFactors.ownLocalVariableFactor, "mustBeSettable")
				.append(termFactors.ownLocalVariableTypeFactor, "Int")
				
				.append(new TermFactor(1, "testFactor"), "get")
				.append(new TermFactor(1, "testFactor"), "set")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
}
