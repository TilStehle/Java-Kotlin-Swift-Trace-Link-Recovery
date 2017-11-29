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
public class TestInitializerDeclaration {

	private static final Type DECLARATION = Type.initializerDeclaration;
	
	private static String constructor1 = "init() {}";
	private static String constructor2 = "init(a:Int, b:Int) {}";
	private static String constructor3 = "init(list:List<String>) {}";
	
	private SwiftTestParser<LuceneDocument> jtp = new SwiftTestParser<>(new LuceneDocsFactory());
	
	@Test
	public void testConstructor1() {
		List<LuceneDocument> docs = jtp.parseDocuments(constructor1, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb.append(TermFactors.OWN_CONSTRUCTOR_FACTOR, "init").toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}

	@Test
	public void testConstructor2() {
		List<LuceneDocument> docs = jtp.parseDocuments(constructor2, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(TermFactors.OWN_CONSTRUCTOR_FACTOR, "init")
				.append(TermFactors.OWN_PARAMETER_FACTOR, "a")
				.append(TermFactors.OWN_PARAMETER_TYPE_FACTOR, "Int")
				.append(TermFactors.OWN_PARAMETER_FACTOR, "b")
				.append(TermFactors.OWN_PARAMETER_TYPE_FACTOR, "Int")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
	@Test
	public void testConstructor3() {
		List<LuceneDocument> docs = jtp.parseDocuments(constructor3, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(TermFactors.OWN_CONSTRUCTOR_FACTOR, "init")
				.append(TermFactors.OWN_PARAMETER_FACTOR, "list")
				.append(TermFactors.OWN_PARAMETER_TYPE_FACTOR, "List")
				.append(TermFactors.OWN_PARAMETER_TYPE_FACTOR, "String")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
}