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
public class TestExtensionDeclaration {

	private static final Type DECLARATION = Type.extensionDeclaration;
	
	private static String class1 = "extension E {}";
	private static String class2 = "extension E : I, J {}";
	
	private SwiftTestParser<LuceneDocument> jtp = new SwiftTestParser<>(new LuceneDocsFactory());
	
	@Test
	public void testCase1() {
		List<LuceneDocument> docs = jtp.parseDocuments(class1, DECLARATION);

		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(TermFactors.OWN_TYPE_DECLARATION_FACTOR, "E")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}

	@Test
	public void testCase2() {
		List<LuceneDocument> docs = jtp.parseDocuments(class2, DECLARATION);

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
