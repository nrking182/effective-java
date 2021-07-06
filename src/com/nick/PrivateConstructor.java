package com.nick;

public class PrivateConstructor {
    //used mainly for grouping static methods and fields


    //enforce noninstantiability with private constructor
    //this overrides default paramaterless default constructor that the compiler provides
    private PrivateConstructor() {
        throw new AssertionError(); //not required but provides insurance
    }

    //also prevents class from being subclassed
}
