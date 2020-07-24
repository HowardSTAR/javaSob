package com.geekbrains.lesson1.thirdMission;

public class Triangle extends ShapeParameter {
    public Triangle(String name, int perim) {
        super(name, perim);
    }

    @Override
    public void shape() {
        System.out.println(toString() + "Я с 3 углами!");
    }
}
