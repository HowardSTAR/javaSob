package com.geekbrains.lesson2.ArrayList;

import java.util.Arrays;

public class MyArrayList<T> implements ReArrayList<T> {
    private static final int DEFAULT_CAPACITY = 10;

    private T[] array;
    private int size = 0;

    public MyArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public MyArrayList(int defaultCapacity) {
        this.array = (T[]) new Object[defaultCapacity];
    }

    @Override
    public void add(T v) {
        if (v == null) try {
            throw new IllegalAccessException("v == null");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        sizeArr();
        array[size++] = v;
    }

    private void sizeArr() {
        if (size == array.length) {
            array = arrSize();
        }
    }

    private T[] arrSize() {
        return Arrays.copyOf(array, array.length * 2);
    }

    @Override
    public boolean remove(T v) {
        return remove(indexOf(v));
    }

    @Override
    public boolean remove(int i) {
        if (i < 0 || i >= size) {
            return false;
        }
        for (int j = i; j < size - 1; j++) {
            array[j] = array[j + 1];
        }
        array[--size] = null;
        return true;
    }

    @Override
    public T get(T v) {
        return get(indexOf(v));
    }

    @Override
    public T get(int i) {
        if (i > 0 && i < size) {
            return array[i];
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == array.length;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int indexOf(T v) {
        if (v == null) {
            return -1;
        }
        for (int i = 0; i < size; i++) {
            if (array[i].equals(v)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void display() {
        System.out.println("////////////////");
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }
}
