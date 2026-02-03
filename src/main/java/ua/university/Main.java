package ua.university;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal[] animals = {dog, cat, dog};
        for(Animal a : animals) {
            a.speak();
        }

        A a = new B();
        a.process("hi");

        Animal a1 = new Dog();
        Animal b = new Cat();

        if(a1 instanceof Dog) {a1.fetchStick();}
        else{System.out.println("об'єкт не є собакою");}

        if(b instanceof Dog) {b.fetchStick();}
        else{System.out.println("об'єкт не є собакою");}

        Animal a2 = new Dog();
        Dog d = (Dog) a2;

        //Animal a3 = new Cat();
        //Dog d2 = (Dog) a3;  //тут ми запевняємо, що кіт є собакою -> ClassCastException


    }
}