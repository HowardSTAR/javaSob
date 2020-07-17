package com.geekbrains.lesson1.thirdMission;

public class Square extends ShapeParameter {
    public Square(String name, int perim) {
        super(name, perim);
    }

    @Override
    public void shape() {
        System.out.println(toString() + "Я квадртаный квадрат!");
    }
}
