package de.unihamburg.swk.parsing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import de.unihamburg.swk.parsing.document.TermMapperManager;
import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneDocsFactory;
import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneDocument;

public class RuntimeTest {

	public static void main(String[] args) {
		
		List<File> files = searchFile("./testDocs/TwidereDomainModel", ".swift");
		Collections.shuffle(files);
		
//		System.out.println(new JavaParser<>("./testDocs/Init.java", new LuceneDocsFactory()).parseDocuments().size());

		TermMapperManager.setData("./mappings");
		
		for (File file : files) {
			
			SwiftParser<LuceneDocument> parser = new SwiftParser<>(file.getAbsolutePath(), new LuceneDocsFactory());
			
			long time = System.currentTimeMillis();

			List<LuceneDocument> list = parser.parseDocuments();
			
			long time2 = System.currentTimeMillis();
			
			System.err.println((time2 - time) + " ms");
			System.err.println(file.getName() + " " + list.size());
			System.err.println();

			parser = null;
			list = null;
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
//		long time = System.currentTimeMillis();
//		
//		List<LuceneDocument> list = parser.parseDocuments();
//		
//		System.out.println((System.currentTimeMillis() - time) / 1000 + " sec");
//		
//		int size = list.size();
//		System.out.println(size);
//		
//		for (LuceneDocument luceneDocument : list) {
//			System.out.println(luceneDocument.toString() + " #" + luceneDocument.getTraceabilityPointer().getPointerType());
//		}
		
		
	}
	
	public static List<File> searchFile(String dir, String suffix) {
		return searchFile(new File(dir), suffix);
	}
	
	private static List<File> searchFile(File dir, String suffix) {
		File[] files = dir.listFiles();
		List<File> matches = new ArrayList<> ();
		if (files != null) {
			for (int i = 0; i < files.length; i++) {
				if (files[i].getName().endsWith(suffix)) { 
					matches.add(files[i]);
//					System.out.println(linesOfCode(files[i]) + ";" + files[i].getName());
				}
				if (files[i].isDirectory()) {
					matches.addAll(searchFile(files[i], suffix));
				}
			}
		}
		return matches;
	}
	
	public static int linesOfCode(File f) {
		int count = 0;
		try (FileReader fr = new FileReader(f); BufferedReader br = new BufferedReader(fr)) {
			String line;
			while ((line = br.readLine()) != null) {
				line = line.replaceAll("\\n|\\t|\\s", "");
				
				if ((!line.equals("")) && (!line.startsWith("//") && (!line.contains("*")))) {
					count++;
				}
			};
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;

	}
	
}
/*
 * 
 */

//package de.andreasschoknecht.LS3.test;
//
//import java.io.IOException;
//import java.util.List;
//import java.util.Stack;
//
//import com.google.common.collect.HashMultiset;
//
//import de.unihamburg.masterprojekt2016.traceability.TraceabilityLink;
//import de.unihamburg.masterprojekt2016.traceability.TypePointer;
//import de.unihamburg.masterprojekt2016.traceability.TypePointerClassification;
//import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneTraceabilityRecoveryService;
//
//public class DummyTest2 {
//
//	public static void main(String[] args) throws IOException {
//		
//		
//		LuceneTraceabilityRecoveryService recoveryService = new LuceneTraceabilityRecoveryService();
//		recoveryService.setIndexPath("/Users/macbook/Desktop/Index");
//		recoveryService.readDocuments("./testDocs/Source", "./testDocs/Source");
//		
////		recoveryService.readDocuments("./testDocs/android-prototype", "./testDocs/mellow-ios");
//
//		System.out.println("--------NumberOfDocs--------");
//		System.out.println(recoveryService.getNumberOfDocs());
//
//
////		TypePointer pointer = new TypePointer("org.mariotaku.twidere.model.AccountDetails", TypePointerClassification.CLASS);
//
//		System.out.println("--------Links-----------");
//		
//		HashMultiset<String> multiset = HashMultiset.create();
//		multiset.add("accountKey");
//		multiset.add("createdAt");
//		
//		List<TraceabilityLink> links =  recoveryService.getSortedTraceabilityLinksForQuery(multiset);
//		
//		for (TraceabilityLink traceabilityLink : links) {
//			System.out.println(traceabilityLink.getTarget().getDisplayName() + " " + traceabilityLink.getProbability());
//		}
//		
//	}
//
//}
