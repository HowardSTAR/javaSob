package com.geekbrains.lesson1.thirdMission;

public class Circle extends ShapeParameter {
    public Circle(String name, int perim) {
        super(name, perim);
    }

    @Override
    public void shape() {
        System.out.println(toString() + "Я круглый!");
    }
}
