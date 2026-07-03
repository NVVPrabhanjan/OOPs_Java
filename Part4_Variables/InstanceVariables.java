package Part4_Variables;

public class InstanceVariables {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.set("Riya", 20);

        Student s2 = new Student();
        s2.set("Rahul", 22);

        System.out.println(s1.name + " " + s1.age);
        System.out.println(s2.name + " " + s2.age);
    }
}

class Student {
    String name; // Instance variable
    int age; // Instance variable

    void set(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
// Each object has its own copy of instance variables.
// They are created when an object is created.
// They are destroyed when an object is destroyed.
// Stored in the Heap Memory as part of each object.