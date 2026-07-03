package Part8_FinalKeyword;

class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }
}

public class FinalVariableDemo {
    // Blank final variable - must be initialized in constructor
    final String course;

    public FinalVariableDemo(String course) {
        this.course = course;
    }

    public static void main(String[] args) {
        // 1. Final Local Variable
        final int age = 20;
        // age = 30; // Compile-time error: The local variable age cannot be assigned

        System.out.println("Final local variable age: " + age);

        // 2. Blank Final Variable Demo
        FinalVariableDemo demoObj = new FinalVariableDemo("Java OOPs");
        System.out.println("Blank final variable course: " + demoObj.course);

        // 3. Final Reference Variable
        final Student s = new Student("Rahul");
        // s = new Student("Amit"); // Compile-time error: The local variable s cannot be assigned

        // But we CAN modify the internal fields of the final object
        System.out.println("Original student name: " + s.name);
        s.name = "Amit"; 
        System.out.println("Modified student name (inside final reference object): " + s.name);
    }
}
