package Part6_ThisKeyword;

public class ReferClassVariableDemo {
    String name;
    int age;

    public ReferClassVariableDemo(String name, int age) {
        this.name = name; // refers to instance variable 'name'
        this.age = age;   // refers to instance variable 'age'
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        ReferClassVariableDemo demo = new ReferClassVariableDemo("Rahul", 21);
        demo.display();
    }
}
