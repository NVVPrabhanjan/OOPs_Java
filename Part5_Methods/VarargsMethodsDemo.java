package Part5_Methods;

public class VarargsMethodsDemo {
    public static void printNumbers(int... numbers) {
        System.out.print("Varargs Method (printNumbers): Arguments passed: ");
        if (numbers.length == 0) {
            System.out.print("None");
        }
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printNumbers(1, 2, 3);
        printNumbers(10, 20, 30, 40, 50);
        printNumbers();
    }
}
