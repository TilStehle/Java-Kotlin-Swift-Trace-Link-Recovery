package de.unihamburg.swk.parsing.antlr4.swift3.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import de.unihamburg.swk.parsing.document.TermFactor;
import org.junit.Test;

import de.unihamburg.swk.parsing.antlr4.java8.test.ExpectedTermsBuilder;
import de.unihamburg.swk.parsing.antlr4.swift3.test.SwiftTestParser.Type;
import de.unihamburg.swk.parsing.document.TermFactors;
import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneDocsFactory;
import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneDocument;

/**
 * @author Jakob Andersen
 */
public class TestProtocolPropertyDeclaration {

	private static final Type DECLARATION = Type.protocolPropertyDeclaration;
	private static String class1 = "var mustBeSettable: Int { get set }";
	private static String class2 = "var fullName: String { get }";
	
	private SwiftTestParser<LuceneDocument> jtp = new SwiftTestParser<>(new LuceneDocsFactory());
	
	@Test
	public void testClass1() {
		List<LuceneDocument> docs = jtp.parseDocuments(class1, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(TermFactors.OWN_ATTRIBUTE_FACTOR, "mustBeSettable")
				.append(TermFactors.OWN_ATTRIBUTE_TYPE_FACTOR, "Int")
				
				.append(new TermFactor(1, "testFactor"), "get")
				.append(new TermFactor(1, "testFactor"), "set")
				
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}

	@Test
	public void testClass2() {
		List<LuceneDocument> docs = jtp.parseDocuments(class2, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(TermFactors.OWN_ATTRIBUTE_FACTOR, "fullName")
				.append(TermFactors.OWN_ATTRIBUTE_TYPE_FACTOR, "String")
				
				.append(new TermFactor(1, "testFactor"), "get")
				
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
}
