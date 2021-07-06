package com.nick.models;

import java.util.Objects;

public class Person implements Alive {
    private String name;
    private Integer number;
    private Boolean isGood;

    public static Alive goodHuman(String name, Integer number) {
        return new Person(name, number, true);
    }

    public Person(final String name, final Integer number, final Boolean isGood) {
        this.name = name;
        this.number = number;
        this.isGood = isGood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Boolean getGood() {
        return isGood;
    }

    public void setGood(Boolean good) {
        isGood = good;
    }

    @Override
    public void hello() {
        System.out.println("PERSON says hello");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(number, person.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number);
    }
}
