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
public class TestFieldDeclaration {

	private static final Type DECLARATION = Type.fieldDeclaration;
	
	private static String field1 = "int i;";
	private static String field2 = "Integer i = 1;";
	private static String field3 = "int a, b = 2, c = 1;";
	private static String field4 = "List<String> list;";
	private static String field5 = "String [] array;";
	
	private JavaTestParser<LuceneDocument> jtp = new JavaTestParser<>(new LuceneDocsFactory());
	
	@Test
	public void testClass1() {
		List<LuceneDocument> docs = jtp.parseDocuments(field1, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(TermFactors.DEFAULT_FACTORS.ownAttributeFactor, "i")
				.append(TermFactors.DEFAULT_FACTORS.ownAttributeTypeFactor, "int")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}

	@Test
	public void testField2() {
		List<LuceneDocument> docs = jtp.parseDocuments(field2, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(TermFactors.DEFAULT_FACTORS.ownAttributeFactor, "i")
				.append(TermFactors.DEFAULT_FACTORS.ownAttributeTypeFactor, "Integer")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
	@Test
	public void testField3() {
		List<LuceneDocument> docs = jtp.parseDocuments(field3, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(TermFactors.DEFAULT_FACTORS.ownAttributeFactor, "a")
				.append(TermFactors.DEFAULT_FACTORS.ownAttributeTypeFactor, "int")
				.append(TermFactors.DEFAULT_FACTORS.ownAttributeFactor, "b")
				.append(TermFactors.DEFAULT_FACTORS.ownAttributeTypeFactor, "int")
				.append(TermFactors.DEFAULT_FACTORS.ownAttributeFactor, "c")
				.append(TermFactors.DEFAULT_FACTORS.ownAttributeTypeFactor, "int")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
	@Test
	public void testField4() {
		List<LuceneDocument> docs = jtp.parseDocuments(field4, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(TermFactors.DEFAULT_FACTORS.ownAttributeFactor, "list")
				.append(TermFactors.DEFAULT_FACTORS.ownAttributeTypeFactor, "List")
				.append(TermFactors.DEFAULT_FACTORS.ownAttributeTypeFactor, "String")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
	@Test
	public void testField5() {
		List<LuceneDocument> docs = jtp.parseDocuments(field5, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(TermFactors.DEFAULT_FACTORS.ownAttributeFactor, "array")
				.append(TermFactors.DEFAULT_FACTORS.ownAttributeTypeFactor, "String")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
}
