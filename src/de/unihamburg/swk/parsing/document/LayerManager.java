package de.unihamburg.swk.parsing.document;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * @author Jakob Andersen
 */

public enum LayerManager {

	INSTANCE;

	private static String path;
	
	private Map<String, String> layers = new HashMap<>();

	private LayerManager() {
	}

	private static void reset() {
		INSTANCE.layers = new HashMap<>();
	}

	public Map<String, String> getData() {
		return this.layers;
	}
	
	public static void setData(String layersPath) {
		reset();
		readFile(layersPath);
	}

	private static void fail() {
		throw new IllegalStateException();
	}
	
	private static void readFile(String layerPath) {
		LayerManager.path = layerPath;
		try (Scanner sc = new Scanner(new File(layerPath))) {
			while (sc.hasNextLine()) {
				String[] line = sc.nextLine().split(";");
				if (line[0].startsWith("#"))
					continue;
				if (line.length < 2) {
					sc.close();
					fail();
				}
				INSTANCE.layers.put(line[0], line[1]);

			}
		} catch (@SuppressWarnings("unused") FileNotFoundException e) {
			System.err.println("missing layers file");
		}
	}

	public void setData(Map<String, String> layers){
		this.layers = layers;
	}

	public void persist() {
		try (FileWriter fw = new FileWriter(path); BufferedWriter bw = new BufferedWriter(fw)) {
			for (Entry<String, String> layerEntry : this.layers.entrySet()) {
				bw.write(String.format("%s;%s", layerEntry.getKey(), layerEntry.getValue()));
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}