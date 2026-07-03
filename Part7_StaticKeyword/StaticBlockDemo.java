package Part7_StaticKeyword;

public class StaticBlockDemo {
    static {
        System.out.println("Static Block 1: Executed when the class is loaded.");
    }

    static {
        System.out.println("Static Block 2: Multiple static blocks execute in sequence.");
    }

    public static void main(String[] args) {
        System.out.println("Main Method: Execution started.");
    }
}
