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
public class TestProtocolDeclaration {

	private static final Type DECLARATION = Type.protocolDeclaration;
	private static String protocol1 = "protocol I { }";
	private static String protocol2 = "protocol I : A, B {}";
	
	// TODO A, B
	
	private SwiftTestParser<LuceneDocument> jtp = new SwiftTestParser<>(new LuceneDocsFactory());
	
	@Test
	public void testProtocol1() {
		List<LuceneDocument> docs = jtp.parseDocuments(protocol1, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(TermFactors.DEFAULT_FACTORS.ownTypeDeclarationFactor, "I")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}

	@Test
	public void testProtocol2() {
		List<LuceneDocument> docs = jtp.parseDocuments(protocol2, DECLARATION);
		
		ExpectedTermsBuilder etb = new ExpectedTermsBuilder();
		String expected  = etb
				.append(TermFactors.DEFAULT_FACTORS.ownTypeDeclarationFactor, "I")
				.append(TermFactors.DEFAULT_FACTORS.ownInheritanceFactor, "A")
				.append(TermFactors.DEFAULT_FACTORS.ownInheritanceFactor, "B")
				.toString();
		
		assertEquals(1, docs.size());
		assertEquals(expected, docs.get(0).getContents());
	}
	
}