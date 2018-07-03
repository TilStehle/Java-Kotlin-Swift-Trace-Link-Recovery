package de.unihamburg.swk.topicparser;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;

import de.unihamburg.swk.traceabilityrecovery.IndexPathNotSetException;
import de.unihamburg.swk.traceabilityrecovery.ProjectPathNotSetException;

public class ParserTest {

	private static final String projectPathK = "/home/paula/git/Java-Kotlin-Swift-Trace-Link-Recovery/src/de/unihamburg/swk/topicparserTestPackage";
	private static final String projectPathG = "/home/paula/git/Java-Kotlin-Swift-Trace-Link-Recovery/src/de/unihamburg/swk";
	private static final Path indexPathK = Paths
			.get("/home/paula/Documents/uni/paper/seperation_of_concerns/lucene-index/klein");
	private static final Path indexPathG = Paths
			.get("/home/paula/Documents/uni/paper/seperation_of_concerns/lucene-index/gross");
	private static final Path emptyIndexPath = Paths.get("");

	@Test
	public void testKleinesProjekt() {
		TopicParser topicParser = new TopicParser(projectPathK, indexPathK);
		topicParser.parse();
	}

	@Test
	public void testGrossesProjekt() {
		TopicParser topicParser = new TopicParser(projectPathG, indexPathG);
		topicParser.parse();
	}

	@Test(expected = ProjectPathNotSetException.class)
	public void testEmptyProjectPath() {
		TopicParser topicParser = new TopicParser("", indexPathK);
		topicParser.parse();
	}

	@Test(expected = ProjectPathNotSetException.class)
	public void testProjectPathIsNull() {
		TopicParser topicParser = new TopicParser(null, indexPathK);
		topicParser.parse();
	}

	@Test(expected = IndexPathNotSetException.class)
	public void testIndexPathIsNull() {
		new TopicParser(projectPathK, null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInvalidProjectPath() {
		TopicParser topicParser = new TopicParser("kjadsfhlksad", indexPathK);
		topicParser.parse();
	}

	@Test(expected = IndexPathNotSetException.class)
	public void testEmptyIndexPath() {
		TopicParser topicParser = new TopicParser(projectPathK, emptyIndexPath);
		topicParser.parse();
	}
}
