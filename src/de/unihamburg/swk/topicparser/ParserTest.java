package de.unihamburg.swk.topicparser;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;

import de.unihamburg.swk.traceabilityrecovery.IndexPathNotSetException;
import de.unihamburg.swk.traceabilityrecovery.ProjectPathNotSetException;

@RunWith(DataProviderRunner.class)
public class ParserTest {

	private static final String projectPathK = "/home/paula/git/Java-Kotlin-Swift-Trace-Link-Recovery/src/de/unihamburg/swk/topicparserTestPackage";
	private static final String projectPathG = "/home/paula/git/Java-Kotlin-Swift-Trace-Link-Recovery/src/de/unihamburg/swk";
	private static final String indexPathK = "/home/paula/Documents/uni/paper/seperation_of_concerns/lucene-index/klein";
	private static final String indexPathG = "/home/paula/Documents/uni/paper/seperation_of_concerns/lucene-index/gross";
	private static final Path emptyIndexPath = Paths.get("");

	@DataProvider
	public static Object[][] filterOptions() {
		// @formatter:off
		return new Object[][] {
				// 1:javaAPIStopFilter, 2:dottedNamesFilter, 3:camelCaseFilter, 4:englishPossessiveFilter,
				// 5:stopFilter, 6:porterStemFilter
				{ "AllFilters", true, true, true, true, true, true },
				{ "NoPorterStemmer", true, true, true, true, true, false },
				{ "NoJavaStopWords", false, true, true, true, false, true },
				{ "NoPorterStemmerAndNoJavaStopFilter", true, true, true, true, false, false } };
		// @formatter:on
	}

	@Test
	@UseDataProvider("filterOptions")
	public void testKleinesProjekt(String indexPathExtension, boolean javaAPIStopFilter, boolean dottedNamesFilter,
			boolean camelCaseFilter, boolean englishPossessiveFilter, boolean stopFilter, boolean porterStemFilter) {
		Path indexPath = Paths.get(indexPathK + indexPathExtension);
		TopicParser topicParser = new TopicParser(projectPathK, indexPath, javaAPIStopFilter, dottedNamesFilter,
				camelCaseFilter, englishPossessiveFilter, stopFilter, porterStemFilter);
		topicParser.parse();
	}

	@Test
	@UseDataProvider("filterOptions")
	public void testGrossesProjekt(String indexPathExtension, boolean javaAPIStopFilter, boolean dottedNamesFilter,
			boolean camelCaseFilter, boolean englishPossessiveFilter, boolean stopFilter, boolean porterStemFilter) {
		Path indexPath = Paths.get(indexPathG + indexPathExtension);
		TopicParser topicParser = new TopicParser(projectPathG, indexPath, javaAPIStopFilter, dottedNamesFilter,
				camelCaseFilter, englishPossessiveFilter, stopFilter, porterStemFilter);
		topicParser.parse();
	}

	@Test(expected = ProjectPathNotSetException.class)
	public void testEmptyProjectPath() {
		Path indexPath = Paths.get(indexPathK);
		TopicParser topicParser = new TopicParser("", indexPath);
		topicParser.parse();
	}

	@Test(expected = ProjectPathNotSetException.class)
	public void testProjectPathIsNull() {
		Path indexPath = Paths.get(indexPathK);
		TopicParser topicParser = new TopicParser(null, indexPath);
		topicParser.parse();
	}

	@Test(expected = IndexPathNotSetException.class)
	public void testIndexPathIsNull() {
		new TopicParser(projectPathK, null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInvalidProjectPath() {
		Path indexPath = Paths.get(indexPathK);
		TopicParser topicParser = new TopicParser("kjadsfhlksad", indexPath);
		topicParser.parse();
	}

	@Test(expected = IndexPathNotSetException.class)
	public void testEmptyIndexPath() {
		TopicParser topicParser = new TopicParser(projectPathK, emptyIndexPath);
		topicParser.parse();
	}
}
