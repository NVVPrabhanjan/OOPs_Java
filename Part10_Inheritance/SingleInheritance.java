package Part10_Inheritance;

public class SingleInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
    }
}

class Animal {

    void eat() {

        System.out.println("Eating");
    }
}

class Dog extends Animal {

}
