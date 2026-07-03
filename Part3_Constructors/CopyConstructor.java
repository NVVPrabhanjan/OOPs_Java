package Part3_Constructors;

// Java does not provide a default copy constructor, but you can easily define your own explicitly.
public class CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student("Rahul", 20);
        Student s2 = new Student(s1);

        s1.age = 21;
        System.out.println(s2.age + " " + s2.name);
    }
}

class Student {

    String name;
    int age;

    Student(String n, int a) {

        name = n;
        age = a;
    }

    Student(Student s) {

        name = s.name;
        age = s.age;
    }
}
