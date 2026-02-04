package com.json.readjsonfile;

import com.fasterxml.jackson.databind.*;
import java.io.File;

public class ReadJsonFile {
	public static void main(String[] args) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		JsonNode node = mapper.readTree(new File("user.json"));
		System.out.println(node.get("name"));
		System.out.println(node.get("email"));
	}
}
