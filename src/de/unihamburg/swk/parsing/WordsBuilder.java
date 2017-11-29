package de.unihamburg.swk.parsing;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;

/**
 * 
 * @author Jakob Andersen
 *
 */

@Deprecated
public class WordsBuilder {
	private static final String FUNNY_CHARACTERS = "(?<=[a-zA-Z])(?=_)|(?<=[a-z])(?=[A-Z])|(?<=[A-Z])(?=[A-Z][a-z])|(?=[A-Z][a-z])|(?<=\\d)(?=\\D)|(?=\\d)(?<=\\D)";

	public static List<String> toWords(String word) {
		return removeFunnyCaracter(word);
	}

	private static List<String> removeFunnyCaracter(String s) {
		List<String> result = new LinkedList<>();
		for (String string : s.split(FUNNY_CHARACTERS)) {
			String s1 = string.replace("_", "");
			if (!s1.isEmpty())
				result.add(s1.toLowerCase());
		}
		return result;
	}

	// @Test
	public static void main(String[] args) {

		List<String> list = Arrays.asList("_name", "_DEFAULT_VALUE_K", "getName", "HTTPConnection", "mach2do", "eclipseRCPExt");

		for (String string : list) {
			WordsBuilder.toWords(string).forEach(System.out::println);
		}

	}

}