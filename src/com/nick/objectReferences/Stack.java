package com.nick.objectReferences;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        this.elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e){
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop(){
        if (size == 0){
            throw new EmptyStackException();
        }
        System.out.println("before --size:  " + size);
        Object o = elements[--size];

        System.out.println("before --size:  " + size);
        elements[size] = null; //clean up out of scope
        return o;
    }

    public void ensureCapacity(){
        if (elements.length == size){
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }
}
