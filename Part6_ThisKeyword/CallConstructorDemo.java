package Part6_ThisKeyword;

public class CallConstructorDemo {
    String name;
    String city;

    public CallConstructorDemo() {
        this("Default User", "Unknown City"); // calls the parameterized constructor below
        System.out.println("No-argument Constructor Executed.");
    }

    public CallConstructorDemo(String name, String city) {
        this.name = name;
        this.city = city;
        System.out.println("Parameterized Constructor Executed.");
    }

    public void display() {
        System.out.println("User: " + name + " from " + city);
    }

    public static void main(String[] args) {
        CallConstructorDemo demo = new CallConstructorDemo();
        demo.display();
    }
}
