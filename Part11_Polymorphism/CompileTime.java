package Part11_Polymorphism;

public class CompileTime {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(1, 2));
        System.out.println(c.add(1, 2, 3));
        System.out.println(c.add(1.0, 2.0));
    }
}

class Calculator {

    int add(int a, int b) {

        return a + b;
    }

    int add(int a, int b, int c) {

        return a + b + c;
    }

    double add(double a, double b) {

        return a + b;
    }
}
// Compiler already knows which method to call.