package ru.geekbrains.lesson6;

public class FirstApp6 {

    public static void main(String[] args) {

        Animal animal1 = new Cat("Мурзик");
        if (animal1 instanceof Cat){
            ((Cat)animal1).catInfo();
        }
        animal1.run();
        animal1.swim();
        System.out.println();

        Animal animal2 = new Cat("Васька");
        if(animal2 instanceof Cat){
            ((Cat)animal2).catInfo();
        }
        animal2.run();
        animal2.swim();
        System.out.println();

        Animal animal3 = new Dog("Бобик");
        if (animal3 instanceof Dog){
            ((Dog)animal3).dogInfo();
        }
        animal3.run();
        animal3.swim();
        System.out.println();

        Animal animal4 = new Dog("Дарси");
        if (animal4 instanceof Dog){
            ((Dog)animal4).dogInfo();
        }
        animal4.run();
        animal4.swim();
        System.out.println();

        Animal animal5 = new Dog("Жучка");
        if (animal5 instanceof Dog){
            ((Dog)animal5).dogInfo();
        }
        animal5.run();
        animal5.swim();

        System.out.println();
        System.out.println("Всего " + Cat.getCounter() + " кота(ов) и " + Dog.getCounter() + " собак(и)");

    }
}
