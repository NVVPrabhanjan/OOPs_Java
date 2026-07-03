package Part5_Methods;

public class StaticMethodsDemo {
    public static int add(int a, int b) {
        return a + b;
    }

    public static void printWelcomeMessage() {
        System.out.println("Static Method (printWelcomeMessage): Welcome to Java Methods Revision!");
    }

    public static void main(String[] args) {
        StaticMethodsDemo.printWelcomeMessage();
        int sum = StaticMethodsDemo.add(15, 35);
        System.out.println("Static Method (add): 15 + 35 = " + sum);
    }
}
