package com.json.filterage;

import com.fasterxml.jackson.databind.*;

public class FilterAge {
	public static void main(String[] args) throws Exception {
        String json="[{\"name\":\"A\",\"age\":20},{\"name\":\"B\",\"age\":30}]";
        ObjectMapper mapper = new ObjectMapper();
        JsonNode arr = mapper.readTree(json);
        for(JsonNode n:arr){
            if(n.get("age").asInt()>25)
                System.out.println(n);
        }
    }
}
