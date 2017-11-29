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
				.append(TermFactors.OTHER_TYPE_DECLARATION_FACTOR, "A")
				.append(TermFactors.OWN_ATTRIBUTE_FACTOR, "s")
				.append(TermFactors.OWN_ATTRIBUTE_TYPE_FACTOR, "String")
				.toString();

		assertEquals(expected0, docs.get(0).getContents());
		
		// constructor #3
		
		ExpectedTermsBuilder etb1 = new ExpectedTermsBuilder();
		String expected1  = etb1
				.append(TermFactors.OTHER_TYPE_DECLARATION_FACTOR, "A")
				.append(TermFactors.OWN_CONSTRUCTOR_FACTOR, "A")
				.append(TermFactors.OWN_PARAMETER_FACTOR, "s")
				.append(TermFactors.OWN_PARAMETER_TYPE_FACTOR, "String")
				.toString();

		assertEquals(expected1, docs.get(1).getContents());
		
		// method #4
		
		ExpectedTermsBuilder etb2 = new ExpectedTermsBuilder();
		String expected2  = etb2
				.append(TermFactors.OTHER_TYPE_DECLARATION_FACTOR, "A")
				.append(TermFactors.OWN_METHOD_FACTOR, "foo")
				.append(TermFactors.OWN_METHOD_TYPE_FACTOR, "void")
				.append(TermFactors.OWN_LOCAL_VARIABLE_FACTOR, "i")
				.append(TermFactors.OWN_LOCAL_VARIABLE_TYPE_FACTOR, "int")
				.toString();

		assertEquals(expected2, docs.get(2).getContents());
		
		// attribute #6
		
		ExpectedTermsBuilder etb3 = new ExpectedTermsBuilder();
		String expected3 = etb3
				.append(TermFactors.OTHER_TYPE_DECLARATION_FACTOR, "Inner")
				.append(TermFactors.OWN_ATTRIBUTE_FACTOR, "i")
				.append(TermFactors.OWN_ATTRIBUTE_TYPE_FACTOR, "int")
				.toString();

		assertEquals(expected3, docs.get(3).getContents());
		
		// inner class #5
		
		ExpectedTermsBuilder etb4 = new ExpectedTermsBuilder();
		String expected4  = etb4
				.append(TermFactors.OTHER_TYPE_DECLARATION_FACTOR, "A")
				.append(TermFactors.OWN_TYPE_DECLARATION_FACTOR, "Inner")
				
				.append(TermFactors.OTHER_ATTRIBUTE_FACTOR, "i")
				.append(TermFactors.OTHER_ATTRIBUTE_TYPE_FACTOR, "int")
				.toString();

		assertEquals(expected4, docs.get(4).getContents());
		
		// class #1
		
		ExpectedTermsBuilder etb5 = new ExpectedTermsBuilder();
		String expected5  = etb5
				.append(TermFactors.OWN_TYPE_DECLARATION_FACTOR, "A")
				.append(TermFactors.OWN_INHERITANCE_FACTOR, "B")
				
				.append(TermFactors.OTHER_ATTRIBUTE_FACTOR, "s")
				.append(TermFactors.OTHER_ATTRIBUTE_TYPE_FACTOR, "String")
				
				.append(TermFactors.OTHER_CONSTRUCTOR_FACTOR, "A")
				.append(TermFactors.OTHER_PARAMETER_FACTOR, "s")
				.append(TermFactors.OTHER_PARAMETER_TYPE_FACTOR, "String")
				
				.append(TermFactors.OTHER_METHOD_FACTOR, "foo")
				.append(TermFactors.OTHER_METHOD_TYPE_FACTOR, "void")
				.append(TermFactors.OTHER_LOCAL_VARIABLE_FACTOR, "i")
				.append(TermFactors.OTHER_LOCAL_VARIABLE_TYPE_FACTOR, "int")
				
				.append(TermFactors.OTHER_TYPE_DECLARATION_FACTOR, "Inner")
				.append(TermFactors.OTHER_ATTRIBUTE_FACTOR, "i")
				.append(TermFactors.OTHER_ATTRIBUTE_TYPE_FACTOR, "int")
				.toString();

		assertEquals(expected5, docs.get(5).getContents());
		
		// class #7
		
		ExpectedTermsBuilder etb6 = new ExpectedTermsBuilder();
		String expected6  = etb6
				.append(TermFactors.OWN_TYPE_DECLARATION_FACTOR, "B")
				.toString();

		assertEquals(expected6, docs.get(6).getContents());
	}

}
