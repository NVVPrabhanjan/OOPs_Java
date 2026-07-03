package Part9_Encapsulation;

public class Immutable {
    public static void main(String[] args) {
        Student s = new Student("Rahul");
    }
}

final class Student {

    private final String name;

    Student(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }
}
// An immutable class cannot be modified after creation.
// No setter exists.

// The object can never change.