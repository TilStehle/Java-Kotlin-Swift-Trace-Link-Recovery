package de.unihamburg.swk.parsing.antlr4.swift3.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import de.unihamburg.masterprojekt2016.traceability.AttributePointer;
import de.unihamburg.masterprojekt2016.traceability.MethodPointer;
import de.unihamburg.masterprojekt2016.traceability.TypePointer;
import de.unihamburg.swk.parsing.antlr4.swift3.test.SwiftTestParser.Type;
import de.unihamburg.swk.parsing.document.LayerManager;
import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneDocsFactory;
import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneDocument;

/**
 * @author Jakob Andersen
 */
public class LayerSwiftTest {

	private static final Type DECLARATION = SwiftTestParser.Type.topLevel;
	private static String clazz = 
			"public class A1 {"
			
			+ " class B11 : A { "
			+ " 	func foo() { } "
			+ "	} "
			+ " class B12 { "
			+ "		var i:Int; "
			+ "	} "
			+ "} "
			
			+ "class A2 : B { "
			+ "	func fuu() {}"
			+ " class B21 : C { "
			+ "		var j:Int; "
			+ "	} "
			
			+ "}";
	
	
	private SwiftTestParser<LuceneDocument> jtp = new SwiftTestParser<>(new LuceneDocsFactory());
	
	@SuppressWarnings("static-method")
	@Before
	public void setLayers() {
		Map<String, String> layers =  new HashMap<>();
		layers.put("A", "A");
		layers.put("B", "B");
		layers.put("C", "C");
		LayerManager.INSTANCE.setData(layers);
	}
	
	@Test
	public void testClass() {
		List<LuceneDocument> docs = jtp.parseDocuments(clazz, DECLARATION);
		
		String defaultLayer = "default";
		String a = "A";
		String b = "B";
		
		assertEquals(9, docs.size());
		
		// A1
		
		assertTrue(docs.get(0).getTraceabilityPointer() instanceof MethodPointer);		
		assertEquals(a, docs.get(0).getLayer());
		
		assertTrue(docs.get(1).getTraceabilityPointer() instanceof TypePointer);		
		assertEquals(a, docs.get(1).getLayer());
		
		assertTrue(docs.get(2).getTraceabilityPointer() instanceof AttributePointer);		
		assertEquals(defaultLayer, docs.get(2).getLayer());
		
		assertTrue(docs.get(3).getTraceabilityPointer() instanceof TypePointer);		
		assertEquals(defaultLayer, docs.get(3).getLayer());

		assertTrue(docs.get(4).getTraceabilityPointer() instanceof TypePointer);		
		assertEquals(defaultLayer, docs.get(4).getLayer());
		
		//A2
		
		assertTrue(docs.get(5).getTraceabilityPointer() instanceof MethodPointer);		
		assertEquals(b, docs.get(5).getLayer());
		
		assertTrue(docs.get(6).getTraceabilityPointer() instanceof AttributePointer);		
		assertEquals(b, docs.get(6).getLayer());
		
		assertTrue(docs.get(7).getTraceabilityPointer() instanceof TypePointer);		
		assertEquals(b, docs.get(7).getLayer());
		
		assertTrue(docs.get(8).getTraceabilityPointer() instanceof TypePointer);		
		assertEquals(b, docs.get(8).getLayer());
	}

}
