package de.unihamburg.swk.topicparser;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.store.FSDirectory;

import de.unihamburg.masterprojekt2016.traceability.TypePointer;
import de.unihamburg.swk.parsing.ISourceCodeParser;
import de.unihamburg.swk.parsing.ParserFactory;
import de.unihamburg.swk.traceabilityrecovery.IndexPathNotSetException;
import de.unihamburg.swk.traceabilityrecovery.Language;
import de.unihamburg.swk.traceabilityrecovery.ProjectPathNotSetException;
import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneDocsFactory;
import de.unihamburg.swk.traceabilityrecovery.lucene.LuceneDocument;
import de.unihamburg.swk.traceabilityrecovery.lucene.SourceCodeAnalyzer;

public class TopicParser {

	private String projectPath;
	private Path indexPath;
	private IndexWriter indexWriter;
	private FSDirectory index;
	IndexWriterConfig config;

	public TopicParser(String projectPath, Path indexPath) {
		if (projectPath == null || projectPath.isEmpty())
			throw new ProjectPathNotSetException();
		this.projectPath = projectPath;
		if (indexPath == null || indexPath.toString().isEmpty())
			throw new IndexPathNotSetException();
		this.indexPath = indexPath;
		tryDiscardIndex();
		this.config = new IndexWriterConfig(new SourceCodeAnalyzer());
	}

	public void parse() {
		setUpIndexWriter();
		List<String> sourceFiles = getSourceFilePaths(projectPath);
		for (String filePath : sourceFiles) {
			ISourceCodeParser<LuceneDocument> parser = ParserFactory.createParser(new LuceneDocsFactory(), filePath);
			Collection<LuceneDocument> documents = parser.parseDocuments();
			documents = documents.stream().filter(doc -> doc.getTraceabilityPointer() instanceof TypePointer)
					.collect(Collectors.toList());
			for (LuceneDocument document : documents) {
				// System.out.println(document.getTraceabilityPointer().getDisplayName() + ":\t"
				// + document.getContents());
				try {
					indexWriter.addDocument(document.getDocument());
				} catch (IOException e) {
					System.out.println("Error: An Error occured while adding a LuceneDocument!");
					e.printStackTrace();
				}
			}
		}
		closeWriter();
	}

	private void closeWriter() {
		try {
			indexWriter.flush();
			indexWriter.commit();
			indexWriter.close();
		} catch (IOException e) {
			System.out.println("Error: An Error occured while closing the IndexWriters!");
			e.printStackTrace();
		}
	}

	private void setUpIndexWriter() {
		try {
			index = FSDirectory.open(indexPath);
			indexWriter = new IndexWriter(index, config);
		} catch (IOException e) {
			System.out.println("Error: The IndexWriter could not be initialized!");
			throw new RuntimeException(e);
		}
	}

	private void tryDiscardIndex() {
		try {
			FileUtils.deleteDirectory(new File(indexPath.toString()));
		} catch (IOException e) {
			System.out.println("Error: Directory of IndexPath could not be deleted!");
			e.printStackTrace();
		}
	}

	private List<String> getSourceFilePaths(String... projectPaths) {
		Collection<String> acceptedFileEndings = Arrays.stream(Language.values()).map(lang -> lang.getFileExtension())
				.collect(Collectors.toList());
		List<String> sourceFiles = new ArrayList<String>();
		for (String dirPath : projectPaths) {
			if (dirPath != null && !dirPath.isEmpty()) {
				File dir = new File(dirPath);
				sourceFiles.addAll(filterSourceFiles(dir, acceptedFileEndings).stream().collect(Collectors.toList()));
			} else {
				closeWriter();
				throw new IllegalArgumentException("The directoryPath is not valid!");
			}
		}
		return sourceFiles;
	}

	/**
	 * Filters the Source files in a directory, which possibly contains other files
	 * as well.
	 *
	 * @param dir
	 *            The directory containing source files and possibly other
	 *            directories
	 * @return the paths of source files in the directory
	 */
	private List<String> filterSourceFiles(File dir, Collection<String> fileNameEndings) {
		if (!dir.isDirectory()) {
			System.out.println("Error: could not open directory " + dir.getAbsolutePath());
			closeWriter();
			throw new IllegalArgumentException("dir is no Directory");
		}
		// Filter Source files
		File[] fileList = dir.listFiles(new FileFilter() {

			@Override
			public boolean accept(File pathname) {
				return fileNameEndings.contains(FilenameUtils.getExtension(pathname.getPath()));
			}
		});
		ArrayList<String> filePaths = new ArrayList<>();
		for (File file : fileList) {
			filePaths.add(file.getAbsolutePath());
		}
		File[] subDirectoriesList = dir.listFiles(new FileFilter() {

			@Override
			public boolean accept(File file) {
				return file.isDirectory();
			}
		});
		for (File subDirectory : subDirectoriesList) {
			filePaths.addAll(filterSourceFiles(subDirectory, fileNameEndings));
		}
		return filePaths;
	}

}
