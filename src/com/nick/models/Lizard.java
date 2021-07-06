package com.nick.models;

public class Lizard implements Alive {
    private String name;

    public static Alive from(String name) {
        return new Lizard(name);
    }
    public Lizard(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
