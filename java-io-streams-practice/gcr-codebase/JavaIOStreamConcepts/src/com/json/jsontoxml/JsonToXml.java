package com.json.jsontoxml;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class JsonToXml {
	public static void main(String[] args) throws Exception {
		String json = "{\"name\":\"Anvesh\",\"age\":22}";
		ObjectMapper jsonMapper = new ObjectMapper();
		Object obj = jsonMapper.readValue(json, Object.class);
		XmlMapper xmlMapper = new XmlMapper();
		System.out.println(xmlMapper.writeValueAsString(obj));
	}
}
