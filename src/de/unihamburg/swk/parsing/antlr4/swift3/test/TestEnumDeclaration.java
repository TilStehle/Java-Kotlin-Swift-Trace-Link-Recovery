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
public class TestEnumDeclaration {

	private static final Type DECLARATION = Type.enumDeclaration;
	
	private static String enum1 = "enum E {}";
	private static String enum2 = "enum E { case INSTANCE1 case INSTANCE2 }";
	private static String enum3 = "enum E : I, J {}";
	
	// TODO I / CASE ...
	
	private SwiftTestParser<LuceneDocument> jtp = new SwiftTestParser<>(new LuceneDocsFactory());
	
	@Test
	public void testClass1() {
		List<LuceneDocument> docs = jtp.parseDocuments(enum1, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(TermFactors.OWN_TYPE_DECLARATION_FACTOR, "E")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}

	@Test
	public void testClass2() {
		List<LuceneDocument> docs = jtp.parseDocuments(enum2, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(TermFactors.OWN_TYPE_DECLARATION_FACTOR, "E")
				.append(TermFactors.OWN_ATTRIBUTE_FACTOR, "INSTANCE1")
				.append(TermFactors.OWN_ATTRIBUTE_FACTOR, "INSTANCE2")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
	@Test
	public void testClass3() {
		List<LuceneDocument> docs = jtp.parseDocuments(enum3, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(TermFactors.OWN_TYPE_DECLARATION_FACTOR, "E")
				.append(TermFactors.OWN_INHERITANCE_FACTOR, "I")
				.append(TermFactors.OWN_INHERITANCE_FACTOR, "J")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
}
