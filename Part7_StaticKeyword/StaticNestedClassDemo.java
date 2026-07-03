package Part7_StaticKeyword;

class Outer {
    static class Inner {
        void display() {
            System.out.println("Displaying from Static Nested Class!");
        }
    }
}

public class StaticNestedClassDemo {
    public static void main(String[] args) {
        Outer.Inner innerObj = new Outer.Inner();
        innerObj.display();
    }
}
