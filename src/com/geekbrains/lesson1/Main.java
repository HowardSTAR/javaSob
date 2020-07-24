package com.geekbrains.lesson1;

import com.geekbrains.lesson1.firstMission.Person;
import com.geekbrains.lesson1.secondMission.Car;
import com.geekbrains.lesson1.secondMission.Lorry;
import com.geekbrains.lesson1.thirdMission.Circle;
import com.geekbrains.lesson1.thirdMission.ShapeParameter;
import com.geekbrains.lesson1.thirdMission.Square;
import com.geekbrains.lesson1.thirdMission.Triangle;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder()
                .setFirstName("Seva")
                .setCountry("Russia")
                .setGander("M")
                .setAge(22)
                .creatPerson();
        System.out.println(person.getFirstName() +
                ", " + person.getCountry() +
                ", " + person.getGander());

        System.out.println("_____________________");

        Car carL = new Lorry();
        carL.move();

        System.out.println("_____________________");

        ShapeParameter circle = new Circle("Круг", 26);
        ShapeParameter triangle = new Triangle("Триугольника", 94);
        ShapeParameter square = new Square("Квадрат", 761);

        List<ShapeParameter> parameters = Arrays.asList(circle, triangle, square);
        for (ShapeParameter s : parameters) {
            s.shape();
        }
    }
}
