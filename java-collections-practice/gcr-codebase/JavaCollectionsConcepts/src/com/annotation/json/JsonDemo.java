package com.annotation.json;

import java.lang.annotation.*;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField{
    String name();
}
class User{
    @JsonField(name="user_name")
    String name;
    @JsonField(name="user_age")
    int age;
    User(String n,int a){
        name=n;
        age=a;
    }
}
public class JsonDemo{
    public static void main(String[] args)throws Exception{
        User u=new User("Anvesh",22);
        StringBuilder json=new StringBuilder("{");
        for(Field f:u.getClass().getDeclaredFields()){
            JsonField jf=f.getAnnotation(JsonField.class);
            json.append("\"").append(jf.name())
                .append("\":\"").append(f.get(u)).append("\",");
        }
        json.deleteCharAt(json.length()-1);
        json.append("}");
        System.out.println(json);
    }
}
