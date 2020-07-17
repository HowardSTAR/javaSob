package com.geekbrains.lesson1.secondMission;

public abstract class Car implements Moveable, Stopable {
    public Engine engine;
    private String color;
    private String name;

    // open скорее надо сделать как start и
    // расположить все таки перед тем как машина зваодится ;)
    protected void open(){
        System.out.println("Car opening");
    }

    protected void start() {
        System.out.println("Car starting");
    }

    // Нужно имплементировать наши интрфейсы и переопределить их,
    // после того как завели она поедет, а потом остановится(когда-нибудь)
    @Override
    public void move() {
        System.out.println("Car moving");
    }

    @Override
    public void stop() {
        System.out.println("Car stop");
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
