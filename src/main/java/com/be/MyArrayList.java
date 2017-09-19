package com.be;

public class MyArrayList<T> {

    private static final int DEFAULT_CAPACITY = 10;

    private Object[] elements;

    private int size;

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public int size() {
        return size;
    }

    public void add(T element) {
    }

    public T get(int index) {
        return null;
    }

    public void remove(int index) {

    }
}
