package Part11_Polymorphism;

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Animal a;

        a = new Dog();

        a.sound();

        a = new Cat();

        a.sound();
    }
}

class Animal {

    void sound() {

        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {

        System.out.println("Bark");
    }
}

class Cat extends Animal {

    @Override
    void sound() {

        System.out.println("Meow");
    }
}

// Although the reference type is Animal, the actual object decides which method
// is called.