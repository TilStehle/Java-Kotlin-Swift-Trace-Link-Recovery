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
public class TestLocalVariableDeclaration {

	private static final Type DECLARATION1 = Type.constructorDeclaration;
	private static final Type DECLARATION2 = Type.methodDeclaration;
	
	private static String localVariable1 = "Clazz() { int i; }";
	private static String localVariable2 = "Clazz() { int i, j; }";
	private static String localVariable3 = "void foo() { String [] s; }";
	private static String localVariable4 = "void foo() { List<A<B>> list; }";
	
	private JavaTestParser<LuceneDocument> jtp = new JavaTestParser<>(new LuceneDocsFactory());
	
	@Test
	public void testLocalVariable1() {
		List<LuceneDocument> docs = jtp.parseDocuments(localVariable1, DECLARATION1);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(TermFactors.OWN_CONSTRUCTOR_FACTOR, "Clazz")
				.append(TermFactors.OWN_LOCAL_VARIABLE_FACTOR, "i")
				.append(TermFactors.OWN_LOCAL_VARIABLE_TYPE_FACTOR, "int")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}

	@Test
	public void testLocalVariable2() {
		List<LuceneDocument> docs = jtp.parseDocuments(localVariable2, DECLARATION1);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(TermFactors.OWN_CONSTRUCTOR_FACTOR, "Clazz")
				.append(TermFactors.OWN_LOCAL_VARIABLE_FACTOR, "i")
				.append(TermFactors.OWN_LOCAL_VARIABLE_TYPE_FACTOR, "int")
				.append(TermFactors.OWN_LOCAL_VARIABLE_FACTOR, "j")
				.append(TermFactors.OWN_LOCAL_VARIABLE_TYPE_FACTOR, "int")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
	@Test
	public void testLocalVariable3() {
		List<LuceneDocument> docs = jtp.parseDocuments(localVariable3, DECLARATION2);
		
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
		List<LuceneDocument> docs = jtp.parseDocuments(localVariable4, DECLARATION2);
		
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
	
}
