package com.annotation.maxlength;

import java.lang.reflect.Field;

public class User{
    @MaxLength(5)
    private String username;
    public User(String username)throws Exception{
        Field f=getClass().getDeclaredField("username");
        MaxLength ml=f.getAnnotation(MaxLength.class);
        if(username.length()>ml.value())
            throw new IllegalArgumentException("Too long!");
        this.username=username;
    }
    public static void main(String[] args)throws Exception{
        new User("Anvesh");
        new User("Anvesh123");
    }
}
