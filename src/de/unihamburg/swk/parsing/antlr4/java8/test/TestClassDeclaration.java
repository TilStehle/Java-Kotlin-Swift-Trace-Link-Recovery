package de.unihamburg.swk.parsing.antlr4.java8.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import de.unihamburg.swk.parsing.antlr4.java8.test.JavaTestParser.Type;
import de.unihamburg.swk.parsing.document.TermFactors;
import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneDocsFactory;
import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneDocument;

/**
 * @author Jakob Andersen
 */
public class TestClassDeclaration {

	private static final Type DECLARATION = Type.normalClassDeclaration;
	private static String class1 = "class A {}";
	private static String class2 = "class A extends B {}";
	private static String class3 = "class A implements I {}";
	private static String class4 = "class A<T1, T2> {}";
	
	private JavaTestParser<LuceneDocument> jtp = new JavaTestParser<>(new LuceneDocsFactory());
	
	@Test
	public void testClass1() {
		List<LuceneDocument> docs = jtp.parseDocuments(class1, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb.append(TermFactors.OWN_TYPE_DECLARATION_FACTOR, "A").toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}

	@Test
	public void testClass2() {
		List<LuceneDocument> docs = jtp.parseDocuments(class2, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected = etb
				.append(TermFactors.OWN_TYPE_DECLARATION_FACTOR, "A")
				.append(TermFactors.OWN_INHERITANCE_FACTOR, "B")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
	@Test
	public void testClass3() {
		List<LuceneDocument> docs = jtp.parseDocuments(class3, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected = etb
				.append(TermFactors.OWN_TYPE_DECLARATION_FACTOR, "A")
				.append(TermFactors.OWN_INHERITANCE_FACTOR, "I")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
	@Test
	public void testClass4() {
		List<LuceneDocument> docs = jtp.parseDocuments(class4, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected = etb
				.append(TermFactors.OWN_TYPE_DECLARATION_FACTOR, "A")
				.append(TermFactors.OWN_TYPE_PARAMETER_FACTOR, "T1")
				.append(TermFactors.OWN_TYPE_PARAMETER_FACTOR, "T2")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
}
