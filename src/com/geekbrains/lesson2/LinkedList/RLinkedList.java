package com.geekbrains.lesson2.LinkedList;

import com.geekbrains.lesson2.ICollection;

public interface RLinkedList<T> extends ICollection {
    void add(T value);

    boolean remove(T value);

    T get(int index);

    boolean contain(T value);

    void insertFirst(T v);

    boolean removeFirst();

    T getFirst();

    void display();

    int indexOf(T value);
}
