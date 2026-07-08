package Part12_Abstraction;

public class AbstractClass {
    public static void main(String[] args) {
        // Animal a = new Animal();
        // This is wrong
        Dog d = new Dog();
        d.sound();
        d.sleep();
    }
}

abstract class Animal {

    abstract void sound();

    Animal() {
        System.out.println("Animal Abstract Class");
    }

    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {

    Dog() {
        System.out.println("Dog child class");
        // super(); // This is not required If me mention no problem in java
        // But If I am not calling super() then Java will automatically call it.
        // So I have to call super() if I want to pass values to the parent class
        // constructor
    }

    @Override
    void sound() {

        System.out.println("Bark");
    }
}