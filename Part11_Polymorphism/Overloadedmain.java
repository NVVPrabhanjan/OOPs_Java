package Part11_Polymorphism;

public class Overloadedmain {

    public static void main(String[] args) {

        System.out.println("Original Main");

        main(10);

        main("Hello");
    }

    public static void main(int a) {

        System.out.println("Integer Main : " + a);

    }

    public static void main(String s) {

        System.out.println("String Main : " + s);

    }
}

// But only Main function with String[] is allowed for JVM and for remaining
// main methods we have to call them explicitly.
// Since main method is static we can't create object to call them. => We have
// to call them directly by using class name.
// Because the compiler only checks Java syntax. The JVM checks for the correct
// entry point at runtime.