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

public class JavaTest {

	private static TermFactors termFactors = TermFactors.DEFAULT_FACTORS;
	private static final Type DECLARATION = JavaTestParser.Type.compilationUnit;
	private static String clazz =
			// class #1
			"class A extends B {"
			// attributes #2
			+ "	private String s;"
			// constructor #3
			+ " public A(String s) {"
			+ "	"
			+ "	}"
			// method #4
			+ "	public void foo() {"
			+ "	int i; print(a);"
			+ " }"
			// inner class #5
			+ "	class Inner {"
			// attribute #6
			+ "	int i;"
			+ "	}"
			
			+ " }"
			// class #7
			+ "	class B {}";
	
	private JavaTestParser<LuceneDocument> jtp = new JavaTestParser<>(new LuceneDocsFactory());
	
	@Test
	public void testClass() {
		List<LuceneDocument> docs = jtp.parseDocuments(clazz, DECLARATION);
		
		assertEquals(7, docs.size());
		
		// attributes #2
		
		ExpectedTermsBuilder etb0 = new ExpectedTermsBuilder();
		String expected0  = etb0
				.append(termFactors.otherTypeDeclarationFactor, "A")
				.append(termFactors.ownAttributeFactor, "s")
				.append(termFactors.ownAttributeTypeFactor, "String")
				.toString();

		assertEquals(expected0, docs.get(0).getContents());
		
		// constructor #3
		
		ExpectedTermsBuilder etb1 = new ExpectedTermsBuilder();
		String expected1  = etb1
				.append(termFactors.otherTypeDeclarationFactor, "A")
				.append(termFactors.ownConstructorFactor, "A")
				.append(termFactors.ownParameterFactor, "s")
				.append(termFactors.ownParameterTypeFactor, "String")
				.toString();

		assertEquals(expected1, docs.get(1).getContents());
		
		// method #4
		
		ExpectedTermsBuilder etb2 = new ExpectedTermsBuilder();
		String expected2  = etb2
				.append(termFactors.otherTypeDeclarationFactor, "A")
				.append(termFactors.ownMethodFactor, "foo")
				.append(termFactors.ownMethodTypeFactor, "void")
				.append(termFactors.ownLocalVariableFactor, "i")
				.append(termFactors.ownLocalVariableTypeFactor, "int")
				.toString();

		assertEquals(expected2, docs.get(2).getContents());
		
		// attribute #6
		
		ExpectedTermsBuilder etb3 = new ExpectedTermsBuilder();
		String expected3 = etb3
				.append(termFactors.otherTypeDeclarationFactor, "Inner")
				.append(termFactors.ownAttributeFactor, "i")
				.append(termFactors.ownAttributeTypeFactor, "int")
				.toString();

		assertEquals(expected3, docs.get(3).getContents());
		
		// inner class #5
		
		ExpectedTermsBuilder etb4 = new ExpectedTermsBuilder();
		String expected4  = etb4
				.append(termFactors.otherTypeDeclarationFactor, "A")
				.append(termFactors.ownTypeDeclarationFactor, "Inner")
				
				.append(termFactors.otherAttributeFactor, "i")
				.append(termFactors.otherAttributeTypeFactor, "int")
				.toString();

		assertEquals(expected4, docs.get(4).getContents());
		
		// class #1
		
		ExpectedTermsBuilder etb5 = new ExpectedTermsBuilder();
		String expected5  = etb5
				.append(termFactors.ownTypeDeclarationFactor, "A")
				.append(termFactors.ownInheritanceFactor, "B")
				
				.append(termFactors.otherAttributeFactor, "s")
				.append(termFactors.otherAttributeTypeFactor, "String")
				
				.append(termFactors.otherConstructorFactor, "A")
				.append(termFactors.otherParameterFactor, "s")
				.append(termFactors.otherParameterTypeFactor, "String")
				
				.append(termFactors.otherMethodFactor, "foo")
				.append(termFactors.otherMethodTypeFactor, "void")
				.append(termFactors.otherLocalVariableFactor, "i")
				.append(termFactors.otherLocalVariableTypeFactor, "int")
				
				.append(termFactors.otherTypeDeclarationFactor, "Inner")
				.append(termFactors.otherAttributeFactor, "i")
				.append(termFactors.otherAttributeTypeFactor, "int")
				.toString();

		assertEquals(expected5, docs.get(5).getContents());
		
		// class #7
		
		ExpectedTermsBuilder etb6 = new ExpectedTermsBuilder();
		String expected6  = etb6
				.append(termFactors.ownTypeDeclarationFactor, "B")
				.toString();

		assertEquals(expected6, docs.get(6).getContents());
	}

}
