package com.company;

public class Main {

    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.setName("Barsik");
        cat.setAge(2);

        Animal dog = new Dog();
        dog.setName("Jeko");
        dog.setAge(5);

        Animal[] zoo = new Animal[2];
        zoo[0] = cat;
        zoo[1] = dog;

        for (int i = 0; i < zoo.length; i++) {
            zoo[i].makeNoise(); //POLIMORFIZM-yerb nuyn tipi obyektnery irenc tarber kerp en pahum
        }
    }
}
