package Part3_Constructors;

public class PrivateConstructor {
    public static void main(String[] args) {
        Student.getInstance();
    }
}

class Student {

    private static Student instance;

    private Student() {
        System.out.println("Object Created");
    }

    static Student getInstance() {
        if (instance == null) {
            instance = new Student();
        }
        return instance;
    }
}

// Singleton Design Pattern Glance this topic for better understanding.
// Prevent object creation from outside the class