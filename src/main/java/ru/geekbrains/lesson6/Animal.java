package ru.geekbrains.lesson6;

import java.util.Random;

public class Animal {
    Random random = new Random();
    String name;

    public Animal(){
        // nothing to do
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





//    Random rand = new Random();
//    String name;
//
//    public Animal() {
//        // nothing to do
//    }
//
//    public Animal(String name) {
//        this.name = name;
//    }
//
//    public void animalInfo() {
//        System.out.println("Животное: " + name);
//    }
//
//    void run(){
//    }
//
//    void sail() {
//    }
}
