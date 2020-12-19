package com.company;

public class Cat extends Animal {

    private String color;

    public void makeNoise() {
        System.out.println("Myauu, my name is " + getName());
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}