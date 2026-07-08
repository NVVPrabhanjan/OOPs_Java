package Part11_Polymorphism;

public class Upcasting {
    public static void main(String[] args) {

        // Upcasting
        Dog d = new Dog();
        Animal a = d;

        a.sound();

        d.sound();
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
