package ru.geekbrains.lesson6;

import java.util.Random;

public class Animal {
    Random random = new Random();
    private static int counter;
    String name;

    public Animal(){
        // nothing to do
    counter++;
    }

    public Animal(String name) {
        this.name = name;
    }

    public void animalInfo() {
        System.out.println("Животное: " + name);
    }

    public void swim() {
    }

    public void run() {
    }
}
