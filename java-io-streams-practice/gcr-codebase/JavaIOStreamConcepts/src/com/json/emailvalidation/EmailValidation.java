package com.json.emailvalidation;

import com.fasterxml.jackson.databind.*;
import com.github.fge.jsonschema.main.*;
import java.io.File;

public class EmailValidation {
	public static void main(String[] args) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		JsonNode schemaNode = mapper.readTree(new File("schema.json"));
		JsonSchema schema = JsonSchemaFactory.byDefault().getJsonSchema(schemaNode);
		JsonNode jsonData = mapper.readTree(new File("user.json"));
		if (schema.validate(jsonData).isSuccess())
			System.out.println("Valid Email");
		else
			System.out.println("Invalid Email");
	}
}
