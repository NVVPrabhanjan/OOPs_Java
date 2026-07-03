package Part6_ThisKeyword;

public class CallClassMethodDemo {
    public void printWelcome() {
        System.out.println("Welcome to the method demo!");
    }

    public void startProgram() {
        this.printWelcome(); // explicitly calls the printWelcome method of the current object
        System.out.println("Program has started.");
    }

    public static void main(String[] args) {
        CallClassMethodDemo demo = new CallClassMethodDemo();
        demo.startProgram();
    }
}
