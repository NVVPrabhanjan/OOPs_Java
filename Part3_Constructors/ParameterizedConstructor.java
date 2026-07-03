package Part3_Constructors;

public class ParameterizedConstructor {
    public static void main(String[] args) {
        Student s1 = new Student("Prabhanjan", 22);

        Student s2 = new Student("Ranjith", 21);
        System.out.println(s1.age + " " + s1.name);
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
}