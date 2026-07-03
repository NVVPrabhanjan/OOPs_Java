package Part8_FinalKeyword;

class Animal {
    public final void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    // If we try to override sound(), it will throw a compile-time error:
    // public void sound() { System.out.println("Bark"); }
}

public class FinalMethodDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound(); // Inherited but cannot be overridden
    }
}
