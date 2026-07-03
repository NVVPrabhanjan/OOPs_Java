package Part7_StaticKeyword;

class Calculator {
    int value = 5;

    public static int add(int a, int b) {
        return a + b;
    }

    public static void displayValueIncorrectly() {
        // System.out.println(value); // Compilation error if uncommented: Cannot make a static reference to the non-static field
    }

    public static void displayValueCorrectly() {
        Calculator calc = new Calculator();
        System.out.println("Accessing instance variable correctly from static method: " + calc.value);
    }

    public void showStaticMember() {
        System.out.println("Instance method accessing static method: " + add(10, 20));
    }
}

public class StaticMethodDemo {
    public static void main(String[] args) {
        int sum = Calculator.add(10, 20);
        System.out.println("Static Method Sum: " + sum);

        Calculator.displayValueCorrectly();

        Calculator calcObj = new Calculator();
        calcObj.showStaticMember();
    }
}
