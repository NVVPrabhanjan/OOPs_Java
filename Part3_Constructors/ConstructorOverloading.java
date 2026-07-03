package Part3_Constructors;

public class ConstructorOverloading {
    public static void main(String[] args) {
        Student s1 = new Student();

        Student s2 = new Student("Rahul");

        Student s3 = new Student("Rahul", 20);
    }
}

class Student {

    String name;
    int age;

    Student() {

        name = "Unknown";
        age = 0;
    }

    Student(String n) {

        name = n;
        age = 0;
    }

    Student(String n, int a) {

        name = n;
        age = a;
    }
}
// Just like methods, constructors can also be overloaded.