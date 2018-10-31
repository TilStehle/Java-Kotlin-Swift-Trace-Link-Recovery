package de.unihamburg.swk.parsing.antlr4.java8.test;

import de.unihamburg.swk.parsing.document.TermFactor;

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
	
	public ExpectedTermsBuilder append(TermFactor n, String copy) {
		if(n.getFactor() > 0) {
			sb.append(DELIMITER);
			sb.append(String.join(DELIMITER, Collections.nCopies(n.getFactor(), copy)));
		}
		return this;
	}
	
	@Override
	public String toString() {
		String ret = sb.toString();
		return ret.isEmpty() ? null : "null" + ret;
	}
	
}
