package com.json.csvtojson;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.dataformat.csv.*;
import java.io.File;
import java.util.Map;

public class CsvToJson {
	public static void main(String[] args) throws Exception {
		CsvSchema schema = CsvSchema.emptySchema().withHeader();
		CsvMapper csvMapper = new CsvMapper();
		MappingIterator<Map<String, Object>> it = csvMapper.readerFor(Map.class).with(schema)
				.readValues(new File("data.csv"));
		ObjectMapper jsonMapper = new ObjectMapper();
		System.out.println(jsonMapper.writeValueAsString(it.readAll()));
	}
}
