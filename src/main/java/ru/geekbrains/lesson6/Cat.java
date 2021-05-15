package ru.geekbrains.lesson6;

public class Cat extends Animal{

    public Cat(String name){
        this.name = name;
    }

    public void catInfo(){
        System.out.println("Имя кота: " + name);
    }

    public void run(){
        System.out.println(name + " пробежал " + random.nextInt(200) + " метров");
    }

    public void swim(){
        System.out.println("Коты плавать не умеют");
    }
}
