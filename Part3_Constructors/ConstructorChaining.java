package Part3_Constructors;

public class ConstructorChaining {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.age + " " + s1.name);
    }
}

class Student {

    String name;
    int age;

    Student() {

        this("Unknown", 0);
    }

    Student(String n, int a) {

        name = n;
        age = a;
    }
}
// One constructor can call another constructor of the same class using this().
// this() must be the first statement inside the constructor.
