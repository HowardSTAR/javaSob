package com.geekbrains.lesson2;

public interface ICollection {

    boolean isEmpty();

    default boolean isFull(){
        return false;
    }

    int size();
}
