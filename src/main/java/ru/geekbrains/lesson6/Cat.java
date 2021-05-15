package ru.geekbrains.lesson6;

public class Cat extends Animal{
    private static int counter;

    public Cat(String name){
        super(name);
        this.name = name;
        counter++;
    }

    public void catInfo() {
        System.out.println("Имя кота: " + name);
    }

    @Override
    public void run() {
        super.run();
        System.out.println(name + " пробежал " + random.nextInt(200 ) + " метров");
    }

    @Override
    public void swim() {
        super.swim();
        System.out.println("Коты плавать не умеют");
    }
     public static int getCounter() {
        return counter;
     }
}
