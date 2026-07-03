package Part10_Inheritance;

public class ConstructorInheritance {
    public static void main(String[] args) {
        Dog cut = new Dog();

    }
}

class Animal {

    Animal() {
        System.out.println("Animal Constructor");
    }
}

class Dog extends Animal {

    Dog() {
        System.out.println("Dog Constructor");
    }
}

// The parent constructor executes first because Java automatically inserts:

// super();

// as the first statement of a child constructor if you don't write one
// explicitly.