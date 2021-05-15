package ru.geekbrains.lesson6;

public class Dog extends Animal {
    private static int counter;

    public Dog(String name) {
        super(name);
        this.name = name;
        counter++;
    }

    public void dogInfo() {
        System.out.println("Имя собаки: " + name);
    }

    @Override
    public void run() {
        super.run();
        System.out.println(name + " пробежал(а) " + random.nextInt(500) + " метров");
    }

    @Override
    public void swim() {
        super.swim();
        System.out.println(name + " проплыл(а) " + random.nextInt(10) + " метров");
    }
    public static int getCounter(){
        return counter;
    }
}




