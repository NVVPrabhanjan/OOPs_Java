package Part10_Inheritance;

public class MultilevelInheritance {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();
    }
}

class Animal {

    void eat() {

        System.out.println("Eating");
    }
}

class Dog extends Animal {

    void bark() {

        System.out.println("Bark");
    }
}

class Puppy extends Dog {

}