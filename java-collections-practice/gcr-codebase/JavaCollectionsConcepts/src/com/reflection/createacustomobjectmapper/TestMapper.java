package com.reflection.createacustomobjectmapper;

import java.util.*;

public class TestMapper {
	public static void main(String[] args) throws Exception {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "Anvesh");
        map.put("age", 22);

        User user = ObjectMapperUtil.toObject(User.class, map);
        user.show();
    }
}
