package Part8_FinalKeyword;

final class Parent {
    public void display() {
        System.out.println("Displaying from Final Parent class.");
    }
}

// If we try to extend Parent,it will throw a compile-time error:
// class Child extends Parent { }

public class FinalClassDemo {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.display();
    }
}
