package com.geekbrains.lesson1.thirdMission;

public class ShapeParameter {
    private String name;
    private int perim;

    public ShapeParameter(String name, int perim) {
        this.name = name;
        this.perim = perim;
    }

    public void shape() {
        System.out.println(toString() + "Я такая же крутая фигура как и все!");
    }

    @Override
    public String toString() {
        return "Я " + name + ", мой периметр " + perim + " см. ";
    }
}
