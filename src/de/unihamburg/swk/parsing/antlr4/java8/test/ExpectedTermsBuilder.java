package de.unihamburg.swk.parsing.antlr4.java8.test;

import java.util.Collections;

/**
 * @author Jakob Andersen
 */

public class ExpectedTermsBuilder {

	private static final String DELIMITER = " ";
	private StringBuilder sb;
	
	public ExpectedTermsBuilder() {
		sb = new StringBuilder();
	}
	
	public ExpectedTermsBuilder append(int n, String copy) {
		if(n > 0) {
			sb.append(DELIMITER);
			sb.append(String.join(DELIMITER, Collections.nCopies(n, copy)));
		}
		return this;
	}
	
	@Override
	public String toString() {
		String ret = sb.toString();
		return ret.isEmpty() ? null : "null" + ret;
	}
	
}
