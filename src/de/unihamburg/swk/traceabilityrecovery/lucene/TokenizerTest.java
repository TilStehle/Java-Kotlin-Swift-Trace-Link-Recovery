package de.unihamburg.swk.traceabilityrecovery.lucene;

import de.unihamburg.masterprojekt2016.traceability.TraceabilityLink;
import de.unihamburg.masterprojekt2016.traceability.TraceabilityPointer;
import de.unihamburg.masterprojekt2016.traceability.TypePointer;
import de.unihamburg.swk.parsing.JavaParser;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.standard.StandardTokenizer;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;
import org.apache.lucene.util.AttributeFactory;
import org.junit.Test;

import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Tilmann Stehle on 23.01.2016.
 */
public class TokenizerTest {


    @Test
    public void testCamelCaseTokenizer() throws IOException {
        Analyzer sourceCodeAnalyzer = new SourceCodeAnalyzer(SourceCodeAnalyzer.ENGLISH_STOP_WORDS_SET);
        TokenStream tokenStream = sourceCodeAnalyzer.tokenStream("my_keyword_field", new StringReader("DEFAULT_TWITTER_API_URL_FORMAT"));
        CharTermAttribute attr = tokenStream.addAttribute(CharTermAttribute.class);
        tokenStream.reset();
        while (tokenStream.incrementToken()) {
            System.out.println(attr.toString());
        }
        tokenStream.close();
    }

}
