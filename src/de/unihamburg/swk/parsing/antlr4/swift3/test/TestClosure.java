package de.unihamburg.swk.parsing.antlr4.swift3.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import de.unihamburg.swk.parsing.document.TermFactors;
import org.junit.Test;

import de.unihamburg.swk.parsing.antlr4.java8.test.ExpectedTermsBuilder;
import de.unihamburg.swk.parsing.antlr4.swift3.test.SwiftTestParser.Type;
import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneDocsFactory;
import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneDocument;

public class TestClosure {

	private static final Type DECLARATION = SwiftTestParser.Type.closureExpression;
	
	private static String field1 = "{ s1, s2 in return s1 > s2 }";
	private static String field2 = "{_ in x }";
	private static String field3 = "{n -> String in x }";
//	private static String field4 = "let a, b, c";
//	private static String field5 = "let list:List<String>";
//	private static String field6 = "let array:[String]";
//	private static String field7 = "let dic:[Int: String]";

	private static TermFactors termFactors = TermFactors.DEFAULT_FACTORS;
	private SwiftTestParser<LuceneDocument> jtp = new SwiftTestParser<>(new LuceneDocsFactory());
	
	@Test
	public void testClass1() {
		List<LuceneDocument> docs = jtp.parseDocuments(field1, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(termFactors.ownClosureTypeFactor, "void")
				.append(termFactors.ownParameterFactor, "s1")
				.append(termFactors.ownParameterFactor, "s2")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}

	@Test
	public void testField2() {
		List<LuceneDocument> docs = jtp.parseDocuments(field2, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(termFactors.ownClosureTypeFactor, "void")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
	@Test
	public void testField3() {
		List<LuceneDocument> docs = jtp.parseDocuments(field3, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(termFactors.ownClosureTypeFactor, "String")
				.append(termFactors.ownParameterFactor, "n")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
//	
//	@Test
//	public void testField4() {
//		List<LuceneDocument> docs = jtp.parseDocuments(field4, DECLARATION);
//		
//		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
//		String expected  = etb
//				.append(termFactors.ownAttributeFactor, "a")
//				.append(termFactors.ownAttributeFactor, "b")
//				.append(termFactors.ownAttributeFactor, "c")
//				.toString();
//		
//		assertEquals(1, docs.size());
//		assertEquals(expected, docs.get(0).getContents());
//	}
//	
//	@Test
//	public void testField5() {
//		List<LuceneDocument> docs = jtp.parseDocuments(field5, DECLARATION);
//		
//		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
//		String expected  = etb
//				.append(termFactors.ownAttributeFactor, "list")
//				.append(termFactors.ownAttributeTypeFactor, "List")
//				.append(termFactors.ownAttributeTypeFactor, "String")
//				.toString();
//		
//		assertEquals(1, docs.size());
//		assertEquals(expected, docs.get(0).getContents());
//	}
//	
//	@Test
//	public void testField6() {
//		List<LuceneDocument> docs = jtp.parseDocuments(field6, DECLARATION);
//		
//		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
//		String expected  = etb
//				.append(termFactors.ownAttributeFactor, "array")
//				.append(termFactors.ownAttributeTypeFactor, "String")
//				.toString();
//		
//		assertEquals(1, docs.size());
//		assertEquals(expected, docs.get(0).getContents());
//	}
//	
//	@Test
//	public void testField7() {
//		List<LuceneDocument> docs = jtp.parseDocuments(field7, DECLARATION);
//		
//		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
//		String expected  = etb
//				.append(termFactors.ownAttributeFactor, "dic")
//				.append(termFactors.ownAttributeTypeFactor, "Int")
//				.append(termFactors.ownAttributeTypeFactor, "String")
//				.toString();
//		
//		assertEquals(1, docs.size());
//		assertEquals(expected, docs.get(0).getContents());
//	}
	
}
