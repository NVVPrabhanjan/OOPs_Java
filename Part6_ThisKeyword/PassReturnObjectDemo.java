package Part6_ThisKeyword;

public class PassReturnObjectDemo {
    int count = 0;

    public PassReturnObjectDemo increment() {
        this.count++;
        return this; // returns the current object to allow method chaining
    }

    public void printUsingPrinter() {
        Printer printer = new Printer();
        printer.printObjectState(this); // passes the current object 'this' as an argument
    }

    public static void main(String[] args) {
        PassReturnObjectDemo demo = new PassReturnObjectDemo();

        // Method Chaining by returning current object
        demo.increment().increment().increment();

        // Passing current object as an argument
        demo.printUsingPrinter();
    }
}

class Printer {
    public void printObjectState(PassReturnObjectDemo obj) {
        System.out.println("Printer class printing state: Count = " + obj.count);
    }
}