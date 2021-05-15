package ru.geekbrains.lesson6;

public class Dog extends Animal {


    public Dog(String name) {
        this.name = name;
    }

    public void dogInfo() {
        System.out.println("Имя собаки: " + name);
    }

    public void run() {
        System.out.println(name + " пробежал(а) " + random.nextInt(500) + " метров");
    }

    public void swim() {
        System.out.println(name + " проплыл(а) " + random.nextInt(10) + " метров");
    }
}




