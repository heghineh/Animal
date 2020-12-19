package com.company;

public class Dog extends Animal {

    public void makeNoise() {
        System.out.println("Haf, my name is " + getName());
    }

    @Override                  //estegh name chka, bayc jarangel enq Animalic
    public String getName() {
        return super.getName();
    }
}
