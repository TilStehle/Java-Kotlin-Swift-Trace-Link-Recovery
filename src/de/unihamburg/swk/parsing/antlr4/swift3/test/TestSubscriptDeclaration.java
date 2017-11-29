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
public class TestSubscriptDeclaration {

	private static final Type DECLARATION = Type.subscriptDeclaration;
	private static String protocol1 = "subscript(index: Int) -> Double { }";
	private static String protocol2 = "subscript(index: Int) -> List<A> { }";
	private static String protocol3 = "subscript(index: Int) -> Double { get { } set(i) { } }";
	
	private SwiftTestParser<LuceneDocument> jtp = new SwiftTestParser<>(new LuceneDocsFactory());
	
	@Test
	public void testProtocol1() {
		List<LuceneDocument> docs = jtp.parseDocuments(protocol1, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(TermFactors.OWN_METHOD_TYPE_FACTOR, "Double")
				.append(TermFactors.OWN_PARAMETER_FACTOR, "index")
				.append(TermFactors.OWN_PARAMETER_TYPE_FACTOR, "Int")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}

	@Test
	public void testProtocol2() {
		List<LuceneDocument> docs = jtp.parseDocuments(protocol2, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(TermFactors.OWN_METHOD_TYPE_FACTOR, "List")
				.append(TermFactors.OWN_METHOD_TYPE_FACTOR, "A")
				.append(TermFactors.OWN_PARAMETER_FACTOR, "index")
				.append(TermFactors.OWN_PARAMETER_TYPE_FACTOR, "Int")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
	@Test
	public void testProtocol3() {
		List<LuceneDocument> docs = jtp.parseDocuments(protocol3, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(TermFactors.OWN_METHOD_TYPE_FACTOR, "Double")
				.append(TermFactors.OWN_PARAMETER_FACTOR, "index")
				.append(TermFactors.OWN_PARAMETER_TYPE_FACTOR, "Int")
				
				.append(1, "get")
				.append(1, "set")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
}
