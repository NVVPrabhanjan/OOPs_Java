package Part5_Methods;

interface Greetable {
    void greet();
}

public class AbstractMethodsDemo {
    public static void main(String[] args) {
        Greetable greeter = new Greetable() {
            @Override
            public void greet() {
                System.out.println("Abstract Method implementation: Greeting from the overridden method!");
            }
        };
        greeter.greet();
    }
}
