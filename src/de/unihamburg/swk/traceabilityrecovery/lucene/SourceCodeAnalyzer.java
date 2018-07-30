package de.unihamburg.swk.traceabilityrecovery.lucene;

import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.lucene.analysis.CharArraySet;
import org.apache.lucene.analysis.LowerCaseFilter;
import org.apache.lucene.analysis.StopFilter;
import org.apache.lucene.analysis.StopwordAnalyzerBase;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.en.EnglishPossessiveFilter;
import org.apache.lucene.analysis.en.PorterStemFilter;
import org.apache.lucene.analysis.miscellaneous.SetKeywordMarkerFilter;
import org.apache.lucene.analysis.standard.StandardFilter;
import org.apache.lucene.analysis.standard.StandardTokenizer;

/**
 * Created by Tilmann Stehle on 23.01.2017.
 */
public class SourceCodeAnalyzer extends StopwordAnalyzerBase {

	public static final CharArraySet STOP_WORDS_SET;
	public static final CharArraySet ENGLISH_STOP_WORDS_SET;
	public static CharArraySet javaApiWordsSet = null;
	static {
		List<String> englishStopWords = Arrays.asList(new String[] { "a", "an", "and", "are", "as", "at", "be", "but",
				"by", "for", "if", "in", "into", "is", "it", "no", "not", "of", "on", "or", "such", "that", "the",
				"their", "then", "there", "these", "they", "this", "to", "was", "will", "with"});
		List<String> javaStopWords = Arrays.asList(new String[] {"abstract", "assert",
				"boolean", "break", "byte", "case", "char", "class", "continue", "default", "do", "double", "else",
				"enum", "extends", "final", "finally", "float", "for", "if", "implements", "import", "instanceof",
				"int", "interface,", "long", "native", "new", "package", "private", "protected", "public", "return",
				"short", "static", "strictfp", "super", "switch", "synchronized", "this", "throw", "throws",
				"transient", "try", "void", "volatile", "while", "true", "false", "null", "var", "i", "get", "set", "a",
				"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
				"w", "x", "y", "z" });
		List<String> allStopWords = Stream.concat(englishStopWords.stream(), javaStopWords.stream())
				.collect(Collectors.toList());
		CharArraySet englishStopSet = new CharArraySet(englishStopWords, false);
		ENGLISH_STOP_WORDS_SET = CharArraySet.unmodifiableSet(englishStopSet);
		CharArraySet stopSet = new CharArraySet(allStopWords, false);
		STOP_WORDS_SET = CharArraySet.unmodifiableSet(stopSet);
	}

	private boolean dottedNamesFilter;
	private boolean camelCaseFilter;
	private boolean englishPossessiveFilter;
	private boolean porterStemFilter;
	private boolean javaAPIStopFilter;

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

	public SourceCodeAnalyzer(boolean javaAPIStopFilter, boolean dottedNamesFilter, boolean camelCaseFilter,
			boolean englishPossessiveFilter, boolean javaStopFilter, boolean porterStemFilter) {
		this(javaStopFilter ? STOP_WORDS_SET : ENGLISH_STOP_WORDS_SET);
		this.javaAPIStopFilter = javaAPIStopFilter;
		this.dottedNamesFilter = dottedNamesFilter;
		this.camelCaseFilter = camelCaseFilter;
		this.englishPossessiveFilter = englishPossessiveFilter;
		this.porterStemFilter = porterStemFilter;
	}

	protected TokenStreamComponents createComponents(String fieldName) {
		StandardTokenizer source = new StandardTokenizer();
		TokenStream gefilteterStream = new StandardFilter(source);
		if (javaAPIStopFilter) {
			loadJavaApiStopWords();
			gefilteterStream = new StopFilter(gefilteterStream, javaApiWordsSet);
		}
		if (dottedNamesFilter)
			gefilteterStream = new DottedNamesFilter(gefilteterStream);
		if (camelCaseFilter)
			gefilteterStream = new CamelCaseFilter(gefilteterStream);
		gefilteterStream = new LowerCaseFilter(gefilteterStream);
		if (englishPossessiveFilter)
			gefilteterStream = new EnglishPossessiveFilter(gefilteterStream);
		if (!this.stemExclusionSet.isEmpty()) {
			gefilteterStream = new SetKeywordMarkerFilter(gefilteterStream, this.stemExclusionSet);
		}
		if (porterStemFilter)
			gefilteterStream = new PorterStemFilter(gefilteterStream);
		gefilteterStream = new StopFilter(gefilteterStream, this.stopwords);
		return new TokenStreamComponents(source, gefilteterStream);
	}

	private void loadJavaApiStopWords() {
		if (javaApiWordsSet == null) {
			List<String> javaApi = new ArrayList<>();
			try (Stream<String> javaApiStream = Files.lines(
					Paths.get("/home/paula/Documents/uni/paper/seperation_of_concerns/java_api.txt"),
					StandardCharsets.UTF_8)) {
				javaApi = javaApiStream.map(entry -> entry.trim()).collect(Collectors.toList());
			} catch (IOException e) {
				System.out.println("Error: Can't load Java 8 Api txt");
				e.printStackTrace();
			}
			CharArraySet javaAPIstopSet = new CharArraySet(javaApi, false);
			javaApiWordsSet = CharArraySet.unmodifiableSet(javaAPIstopSet);
		}
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
