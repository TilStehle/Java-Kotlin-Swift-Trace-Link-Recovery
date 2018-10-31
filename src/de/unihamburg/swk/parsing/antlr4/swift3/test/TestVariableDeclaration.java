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
public class TestVariableDeclaration {

	private static final Type DECLARATION = Type.variableDeclaration;
	
	private static String field1 = "var i:Int";
	private static String field2 = "var i";
	private static String field3 = "var a, b, c : Int";
	private static String field4 = "var a, b, c";
	private static String field5 = "var namesOfIntegers:[Int: String]";
	private static String field6 = "var array:[String]";
	private static String field7 = "var array:List<Int>";
	private static String field8 = "var mustBeSettable: Int { get {} set {} }";

	private static TermFactors termFactors = TermFactors.DEFAULT_FACTORS;
	private SwiftTestParser<LuceneDocument> jtp = new SwiftTestParser<>(new LuceneDocsFactory());
	
	@Test
	public void testClass1() {
		List<LuceneDocument> docs = jtp.parseDocuments(field1, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(termFactors.ownAttributeFactor, "i")
				.append(termFactors.ownAttributeTypeFactor, "Int")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}

	@Test
	public void testField2() {
		List<LuceneDocument> docs = jtp.parseDocuments(field2, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(termFactors.ownAttributeFactor, "i")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
	@Test
	public void testField3() {
		List<LuceneDocument> docs = jtp.parseDocuments(field3, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(termFactors.ownAttributeFactor, "a")
				.append(termFactors.ownAttributeTypeFactor, "Int")
				.append(termFactors.ownAttributeFactor, "b")
				.append(termFactors.ownAttributeTypeFactor, "Int")
				.append(termFactors.ownAttributeFactor, "c")
				.append(termFactors.ownAttributeTypeFactor, "Int")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
	@Test
	public void testField4() {
		List<LuceneDocument> docs = jtp.parseDocuments(field4, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(termFactors.ownAttributeFactor, "a")
				.append(termFactors.ownAttributeFactor, "b")
				.append(termFactors.ownAttributeFactor, "c")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
	@Test
	public void testField5() {
		List<LuceneDocument> docs = jtp.parseDocuments(field5, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(termFactors.ownAttributeFactor, "namesOfIntegers")
				.append(termFactors.ownAttributeTypeFactor, "Int")
				.append(termFactors.ownAttributeTypeFactor, "String")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
	@Test
	public void testField6() {
		List<LuceneDocument> docs = jtp.parseDocuments(field6, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(termFactors.ownAttributeFactor, "array")
				.append(termFactors.ownAttributeTypeFactor, "String")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
	@Test
	public void testField7() {
		List<LuceneDocument> docs = jtp.parseDocuments(field7, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(termFactors.ownAttributeFactor, "array")
				.append(termFactors.ownAttributeTypeFactor, "List")
				.append(termFactors.ownAttributeTypeFactor, "Int")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
	@Test
	public void testField8() {
		List<LuceneDocument> docs = jtp.parseDocuments(field8, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(termFactors.ownAttributeFactor, "mustBeSettable")
				.append(termFactors.ownAttributeTypeFactor, "Int")
				
				.append(new TermFactor(1, "testFactor"), "get")
				.append(new TermFactor(1, "testFactor"), "set")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
}
