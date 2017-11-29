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
public class TestConstantDeclaration {

	private static final Type DECLARATION = Type.constantDeclaration;
	
	private static String field1 = "let i:Int";
	private static String field2 = "let i";
	private static String field3 = "let a, b, c : Int";
	private static String field4 = "let a, b, c";
	private static String field5 = "let list:List<String>";
	private static String field6 = "let array:[String]";
	private static String field7 = "let dic:[Int: String]";
	
	private SwiftTestParser<LuceneDocument> jtp = new SwiftTestParser<>(new LuceneDocsFactory());
	
	@Test
	public void testClass1() {
		List<LuceneDocument> docs = jtp.parseDocuments(field1, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(TermFactors.OWN_ATTRIBUTE_FACTOR, "i")
				.append(TermFactors.OWN_ATTRIBUTE_TYPE_FACTOR, "Int")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}

	@Test
	public void testField2() {
		List<LuceneDocument> docs = jtp.parseDocuments(field2, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(TermFactors.OWN_ATTRIBUTE_FACTOR, "i")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
	@Test
	public void testField3() {
		List<LuceneDocument> docs = jtp.parseDocuments(field3, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(TermFactors.OWN_ATTRIBUTE_FACTOR, "a")
				.append(TermFactors.OWN_ATTRIBUTE_TYPE_FACTOR, "Int")
				.append(TermFactors.OWN_ATTRIBUTE_FACTOR, "b")
				.append(TermFactors.OWN_ATTRIBUTE_TYPE_FACTOR, "Int")
				.append(TermFactors.OWN_ATTRIBUTE_FACTOR, "c")
				.append(TermFactors.OWN_ATTRIBUTE_TYPE_FACTOR, "Int")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
	@Test
	public void testField4() {
		List<LuceneDocument> docs = jtp.parseDocuments(field4, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(TermFactors.OWN_ATTRIBUTE_FACTOR, "a")
				.append(TermFactors.OWN_ATTRIBUTE_FACTOR, "b")
				.append(TermFactors.OWN_ATTRIBUTE_FACTOR, "c")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
	@Test
	public void testField5() {
		List<LuceneDocument> docs = jtp.parseDocuments(field5, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(TermFactors.OWN_ATTRIBUTE_FACTOR, "list")
				.append(TermFactors.OWN_ATTRIBUTE_TYPE_FACTOR, "List")
				.append(TermFactors.OWN_ATTRIBUTE_TYPE_FACTOR, "String")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
	@Test
	public void testField6() {
		List<LuceneDocument> docs = jtp.parseDocuments(field6, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(TermFactors.OWN_ATTRIBUTE_FACTOR, "array")
				.append(TermFactors.OWN_ATTRIBUTE_TYPE_FACTOR, "String")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
	@Test
	public void testField7() {
		List<LuceneDocument> docs = jtp.parseDocuments(field7, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(TermFactors.OWN_ATTRIBUTE_FACTOR, "dic")
				.append(TermFactors.OWN_ATTRIBUTE_TYPE_FACTOR, "Int")
				.append(TermFactors.OWN_ATTRIBUTE_TYPE_FACTOR, "String")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
}
