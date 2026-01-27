package com.junit.basic;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class FileProcessorTest {

	// test case
	@Test
	public void testFileWriteAndRead() throws IOException {
		FileProcessor processor = new FileProcessor();
		String filename = "test.txt";
		String content = "Hello JUnit";
		processor.writeToFile(filename, content);
		String result = processor.readFromFile(filename);
		assertEquals(content, result);
		Files.deleteIfExists(Path.of(filename));
	}
}