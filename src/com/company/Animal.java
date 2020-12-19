package com.company;

public class Animal {

    private String name;
    private int age;

    public void makeNoise() {  //Animalum grvac metody override arecinq Cat u Dog classnerum
        //kani, vor aystegh ayn datark e, isk myus classnerum voch
    }

    //region Constructors
    Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //endregion

    //region Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //endregion
}