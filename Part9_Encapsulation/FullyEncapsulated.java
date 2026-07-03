package Part9_Encapsulation;

public class FullyEncapsulated {
    public static void main(String[] args) {
        Student s = new Student();
    }
}

class Student {

    private String name;

    private int age;

    private String college;
}
// A fully encapsulated class has all instance variables declared private.
// Access is provided only through methods.