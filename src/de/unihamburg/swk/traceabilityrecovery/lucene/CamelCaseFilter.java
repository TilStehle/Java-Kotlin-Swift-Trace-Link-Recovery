package de.unihamburg.swk.traceabilityrecovery.lucene;

import org.apache.lucene.analysis.TokenStream;

import java.io.IOException;
import java.util.LinkedList;

import org.apache.lucene.analysis.TokenFilter;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;
import org.apache.lucene.analysis.tokenattributes.CharTermAttributeImpl;
import org.apache.lucene.analysis.tokenattributes.PositionIncrementAttribute;

public final class CamelCaseFilter extends TokenFilter {

    private final CharTermAttribute _termAtt;
    private final LinkedList<String> extraTokens = new LinkedList<String>();
    private final PositionIncrementAttribute posIncAtt;
    private State savedState;

    protected CamelCaseFilter(TokenStream input) {
        super(input);
        this._termAtt = addAttribute(CharTermAttribute.class);
        posIncAtt = addAttribute(PositionIncrementAttribute.class);
    }

    @Override
    public boolean incrementToken() throws IOException {
        CharTermAttribute termAtt = this.getAttribute(CharTermAttribute.class);
        if (!extraTokens.isEmpty()) {
            restoreState(savedState);
            termAtt.setEmpty().append(extraTokens.remove());
            return true;
        }
        if (input.incrementToken()) {
            String[] splittedString = splitCamelCase(termAtt.toString());
            if(splittedString.length>1) {
                savedState = captureState();
                for (String camelCaseToken : splittedString) {
                    extraTokens.add(camelCaseToken);
                }
            }
            return true;
        }
        return false;


    }


    static String[] splitCamelCase(String s) {
        return s.replaceAll(
                String.format("%s|%s|%s",
                        "(?<=[A-Z])(?=[A-Z][a-z])",
                        "(?<=[^A-Z])(?=[A-Z])",
                        "(?<=[A-Za-z])(?=[^A-Za-z])"
                ),
                " "
        ).replace("_", "").split(" ");
    }
}
