package de.unihamburg.swk.topicparser;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;

import de.unihamburg.swk.traceabilityrecovery.FileNameNotSetException;
import de.unihamburg.swk.traceabilityrecovery.IndexPathNotSetException;

@RunWith(DataProviderRunner.class)
public class TopicTest {

	private static final String indexPathK = "/home/paula/Documents/uni/paper/seperation_of_concerns/lucene-index/klein";
	private static final String indexPathG = "/home/paula/Documents/uni/paper/seperation_of_concerns/lucene-index/gross";
	private static final Path emptyIndexPath = Paths.get("");

	@DataProvider
	public static Object[][] filterOptions() {
		// @formatter:off
		return new Object[][] {
				{ "AllFilters" }, { "NoPorterStemmer" }, { "NoJavaStopWords" },
				{ "NoPorterStemmerAndNoJavaStopFilter" } };
		// @formatter:on
	}

	@Test
	@UseDataProvider("filterOptions")
	public void testKleinesProjekt(String indexPathExtension) throws IOException {
		Path indexPath = Paths.get(indexPathK + indexPathExtension);
		TopicCalculator topicCalculator = new TopicCalculator(indexPath, "testKlein" + indexPathExtension);
		topicCalculator.calculateTopics();
	}

	@Test
	@UseDataProvider("filterOptions")
	public void testGrossesProjekt(String indexPathExtension) throws IOException {
		Path indexPath = Paths.get(indexPathG + indexPathExtension);
		TopicCalculator topicCalculator = new TopicCalculator(indexPath, "testGross" + indexPathExtension);
		topicCalculator.calculateTopics();
	}

	@Test(expected = IndexPathNotSetException.class)
	public void testEmptyProjectPath() {
		new TopicCalculator(emptyIndexPath, "testEmptyIndex");
	}

	@Test(expected = IndexPathNotSetException.class)
	public void testProjectPathIsNull() {
		new TopicCalculator(null, "testIndexNotSet");
	}

	@Test(expected = FileNameNotSetException.class)
	public void testFileNameIsEmpty() {
		Path indexPath = Paths.get(indexPathK);
		new TopicCalculator(indexPath, "");
	}

	@Test(expected = FileNameNotSetException.class)
	public void testFileNameIsNull() {
		Path indexPath = Paths.get(indexPathK);
		new TopicCalculator(indexPath, null);
	}
}
