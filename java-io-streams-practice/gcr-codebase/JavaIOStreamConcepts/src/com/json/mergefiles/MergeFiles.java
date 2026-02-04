package com.json.mergefiles;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;

public class MergeFiles {
	public static void main(String[] args) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		JsonNode j1 = mapper.readTree(new File("user1.json"));
		JsonNode j2 = mapper.readTree(new File("user2.json"));
		ObjectNode merged = mapper.createObjectNode();
		merged.setAll((ObjectNode) j1);
		merged.setAll((ObjectNode) j2);
		System.out.println(merged.toPrettyString());
	}
}
