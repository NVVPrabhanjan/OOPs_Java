package Part12_Abstraction;

public class InterfaceClass {
    public static void main(String[] args) {

        Dog a;

        a = new Dog();
        a.sound();
    }
}

interface Animal {

    void sound();
}

class Dog implements Animal {

    @Override
    public void sound() {

        System.out.println("Bark");
    }
}
