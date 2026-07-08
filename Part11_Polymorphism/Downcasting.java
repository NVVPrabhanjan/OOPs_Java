package Part11_Polymorphism;

public class Downcasting {
    public static void main(String[] args) {
        Animal a = new Dog();
        Dog d = (Dog) a;
        d.sound();
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
