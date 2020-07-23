package com.geekbrains.lesson2.ArrayList;

import com.geekbrains.lesson2.ICollection;

public interface ReArrayList<T> extends ICollection {

    void add(T v);
    boolean remove(T v);
    boolean remove(int i);
    T get(T v);
    T get(int i);
    int size();
    int indexOf(T v);

    void display();

}
