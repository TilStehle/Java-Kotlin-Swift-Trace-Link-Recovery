package de.unihamburg.swk.topicparser;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;

import de.unihamburg.swk.traceabilityrecovery.FileNameNotSetException;
import de.unihamburg.swk.traceabilityrecovery.IndexPathNotSetException;

public class TopicTest {

	private static final Path indexPathK = Paths
			.get("/home/paula/Documents/uni/paper/seperation_of_concerns/lucene-index/klein");
	private static final Path indexPathG = Paths
			.get("/home/paula/Documents/uni/paper/seperation_of_concerns/lucene-index/gross");
	private static final Path emptyIndexPath = Paths.get("");

	@Test
	public void testKleinesProjekt() throws IOException {
		TopicCalculator topicCalculator = new TopicCalculator(indexPathK, "testKlein");
		topicCalculator.calculateTopics();
	}

	@Test
	public void testGrossesProjekt() throws IOException {
		TopicCalculator topicCalculator = new TopicCalculator(indexPathG, "testGross");
		topicCalculator.calculateTopics();
	}

	@Test(expected = IndexPathNotSetException.class)
	public void testEmptyProjectPath() {
		new TopicCalculator(emptyIndexPath, "testKlein");
	}

	@Test(expected = IndexPathNotSetException.class)
	public void testProjectPathIsNull() {
		new TopicCalculator(null, "testKlein");
	}

	@Test(expected = FileNameNotSetException.class)
	public void testFileNameIsEmpty() {
		new TopicCalculator(indexPathK, "");
	}

	@Test(expected = FileNameNotSetException.class)
	public void testFileNameIsNull() {
		new TopicCalculator(indexPathK, null);
	}
}
