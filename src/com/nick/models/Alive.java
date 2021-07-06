package com.nick.models;

public interface Alive {

    default void hello() {
        System.out.println("hello world");
    }

}
