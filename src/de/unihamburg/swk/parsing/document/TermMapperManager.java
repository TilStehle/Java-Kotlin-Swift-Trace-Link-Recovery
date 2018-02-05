package de.unihamburg.swk.parsing.document;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

/**
 * @author Jakob Andersen
 */

public enum TermMapperManager {

	JAVA, SWIFT, CSHARP, JAVASCRIPT;
	
	private static final String A = "-type";
	private static final String B = "-function";
	private static final String C = "-variable";
	
	private static final int LANGUAGE = 0;
	private static final int TYPE = 1;
	private static final int KEY = 2;
	private static final int VALUE = 3;
	
	private static String path;
	
	private Map<String, String> types = new HashMap<>();
	private Map<String, String> variables = new HashMap<>();
	private Map<String, String> functions = new HashMap<>();
	
	public List<String> types(List<String> strings) {
		return strings.stream().map(this::types).collect(Collectors.toList());
	}
	
	public String types(String string) {
		return types.getOrDefault(string, string);
	}
	
	public List<String> functions(List<String> strings) {
		return strings.stream().map(this::functions).collect(Collectors.toList());
	}
	
	public String functions(String string) {
		return functions.getOrDefault(string, string);
	}
	
	public List<String> variables(List<String> strings) {
		return strings.stream().map(this::variables).collect(Collectors.toList());
	}
	
	public String variables(String string) {
		return variables.getOrDefault(string, string);
	}
	
	public List<Map<String, String>> getData() {
		return Arrays.asList(types, variables, functions);
	}
	
	public void setData(Map<String, String> type, Map<String, String> function, Map<String, String> variable) {
		this.types = type;
		this.functions = function;
		this.variables = variable;
	}
	
	public static void setData(String mappingPath) {
		reset();
		readFile(mappingPath);
	}

	private static void reset() {
		JAVA.types = new HashMap<>();
		JAVA.variables = new HashMap<>();
		JAVA.functions = new HashMap<>();
		SWIFT.types = new HashMap<>();
		SWIFT.variables = new HashMap<>();
		SWIFT.functions = new HashMap<>();
		CSHARP.types = new HashMap<>();
		CSHARP.variables = new HashMap<>();
		CSHARP.functions = new HashMap<>();
		JAVASCRIPT.types = new HashMap<>();
		JAVASCRIPT.variables = new HashMap<>();
		JAVASCRIPT.functions = new HashMap<>();
	}
	
	private static void putMappings(String[] line, TermMapperManager mapperType) {
		switch (line[TYPE]) {
		case A:
			mapperType.types.put(line[KEY], line[VALUE]);
			break;
		case B:
			mapperType.functions.put(line[KEY], line[VALUE]);
			break;
		case C:
			mapperType.variables.put(line[KEY], line[VALUE]);
			break;
		default:
			System.err.println("illegal mapping type: " + line[TYPE]);
		}
	}
	
	private static void readFile(String mappingPath) {
		TermMapperManager.path = mappingPath; 
		try (Scanner sc = new Scanner(new File(mappingPath))) {
			while (sc.hasNextLine()) {
				String[] line = sc.nextLine().split(" ");
				if(line[LANGUAGE].startsWith("#")) continue;
				switch (line[LANGUAGE]) {
				case "JAVA":
					putMappings(line, TermMapperManager.JAVA);
					break;
					case "SWIFT":
						putMappings(line, TermMapperManager.SWIFT);
						break;
					case "CSHARP":
						putMappings(line, TermMapperManager.CSHARP);
						break;
					case "JAVASCRIPT":
						putMappings(line, TermMapperManager.JAVASCRIPT);
						break;
				default:
					break;
				}
			}
		} catch (@SuppressWarnings("unused") FileNotFoundException e) {
			System.err.println("missing mapping file");
		}
	}
	
	public static void persist() {
		try (FileWriter fw = new FileWriter(path); BufferedWriter bw = new BufferedWriter(fw)) {
			JAVA.persist(bw);
			SWIFT.persist(bw);
			CSHARP.persist(bw);
			JAVASCRIPT.persist(bw);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void persist(BufferedWriter bw) throws IOException {
		for (Entry<String, String> typeEntry : this.types.entrySet()) {
			bw.write(String.format("%s %s %s %s", this.name(), A, typeEntry.getKey(), typeEntry.getValue()));
			bw.newLine();
		}
		for (Entry<String, String> functionEntry : this.functions.entrySet()) {
			bw.write(String.format("%s %s %s %s", this.name(), B, functionEntry.getKey(), functionEntry.getValue()));
			bw.newLine();
		}
		for (Entry<String, String> variableEntry : this.variables.entrySet()) {
			bw.write(String.format("%s %s %s %s", this.name(), C, variableEntry.getKey(), variableEntry.getValue()));
			bw.newLine();
		}
	}
	
}