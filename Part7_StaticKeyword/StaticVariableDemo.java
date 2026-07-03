package Part7_StaticKeyword;

class Student {
    String name;
    static String college = "BMSCE";

    public Student(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Name: " + name + ", College: " + college);
    }
}

public class StaticVariableDemo {
    public static void main(String[] args) {
        System.out.println("Accessing static variable via class name: " + Student.college);

        Student s1 = new Student("Amit");
        Student s2 = new Student("Pooja");

        s1.display();
        s2.display();

        Student.college = "RVCE";

        s1.display();
        s2.display();
    }
}
