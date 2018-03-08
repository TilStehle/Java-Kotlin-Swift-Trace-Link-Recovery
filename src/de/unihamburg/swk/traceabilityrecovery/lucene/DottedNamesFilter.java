package de.unihamburg.swk.traceabilityrecovery.lucene;

import org.apache.lucene.analysis.TokenStream;

import java.io.IOException;
import java.util.LinkedList;

import org.apache.lucene.analysis.TokenFilter;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;
import org.apache.lucene.analysis.tokenattributes.PositionIncrementAttribute;

public final class DottedNamesFilter extends TokenFilter {


    private final CharTermAttribute _termAtt;
    private final LinkedList<String> extraTokens = new LinkedList<String>();
    private State savedState;

    protected DottedNamesFilter(TokenStream input) {
        super(input);
        this._termAtt = addAttribute(CharTermAttribute.class);
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
            String[] splittedString = splitAtDots(termAtt.toString());
            if(splittedString.length>1) {
                savedState = captureState();
                for (String dotSeparatedToken : splittedString) {
                    if(!dotSeparatedToken.isEmpty())
                        extraTokens.add(dotSeparatedToken);
                }

                restoreState(savedState);
                termAtt.setEmpty().append(extraTokens.remove());
            }
            return true;
        }
        input.end();
        return false;


    }




    static String[] splitAtDots(String s) {
        return s.split("\\.");
    }
}
