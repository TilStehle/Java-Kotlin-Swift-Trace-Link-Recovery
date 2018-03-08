package de.unihamburg.swk.traceabilityrecovery.lucene;

import org.apache.lucene.analysis.*;
import org.apache.lucene.analysis.en.EnglishAnalyzer;
import org.apache.lucene.analysis.en.EnglishPossessiveFilter;
import org.apache.lucene.analysis.en.PorterStemFilter;
import org.apache.lucene.analysis.miscellaneous.SetKeywordMarkerFilter;
import org.apache.lucene.analysis.pattern.PatternReplaceCharFilter;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.analysis.standard.StandardFilter;
import org.apache.lucene.analysis.standard.StandardTokenizer;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Tilmann Stehle on 23.01.2017.
 */
public class SourceCodeAnalyzer extends StopwordAnalyzerBase {

    public static final CharArraySet STOP_WORDS_SET;
    public static final CharArraySet ENGLISH_STOP_WORDS_SET;
    static {
        List stopWords = Arrays.asList(new String[]{"a", "an", "and", "are", "as", "at", "be", "but", "by", "for", "if", "in", "into", "is", "it", "no", "not", "of", "on", "or", "such", "that", "the", "their", "then", "there", "these", "they", "this", "to", "was", "will", "with"});
        CharArraySet stopSet = new CharArraySet(stopWords, false);
        ENGLISH_STOP_WORDS_SET = CharArraySet.unmodifiableSet(stopSet);
        STOP_WORDS_SET = ENGLISH_STOP_WORDS_SET;
    }

    private final CharArraySet stemExclusionSet;


    public SourceCodeAnalyzer() {
        this(ENGLISH_STOP_WORDS_SET);
    }

    public SourceCodeAnalyzer(CharArraySet stopwords) {
        this(stopwords, CharArraySet.EMPTY_SET);
    }

    public SourceCodeAnalyzer(CharArraySet stopwords, CharArraySet stemExclusionSet) {
        super(stopwords);
        this.stemExclusionSet = CharArraySet.unmodifiableSet(CharArraySet.copy(stemExclusionSet));
    }

    protected TokenStreamComponents createComponents(String fieldName) {
        StandardTokenizer source = new StandardTokenizer();
        StandardFilter standardFilter = new StandardFilter(source);
        DottedNamesFilter dottedNamesFilter = new DottedNamesFilter(standardFilter);
        CamelCaseFilter camelCaseFilter= new CamelCaseFilter(dottedNamesFilter);
        EnglishPossessiveFilter englishPossessiveFilter = new EnglishPossessiveFilter(camelCaseFilter);
        LowerCaseFilter lowerCaseFilter = new LowerCaseFilter(englishPossessiveFilter);
        Object stopFilter = new StopFilter(lowerCaseFilter, this.stopwords);
        if (!this.stemExclusionSet.isEmpty()) {
            stopFilter = new SetKeywordMarkerFilter((TokenStream) stopFilter, this.stemExclusionSet);
        }

        PorterStemFilter result1 = new PorterStemFilter((TokenStream) stopFilter);
        return new TokenStreamComponents(source, result1);
    }

    protected TokenStream normalize(String fieldName, TokenStream in) {
        StandardFilter result = new StandardFilter(in);
        LowerCaseFilter result1 = new LowerCaseFilter(result);
        return result1;
    }

    @Override
    protected Reader initReader(String fieldName, Reader reader) {
        return super.initReader(fieldName, reader);
    }
}
