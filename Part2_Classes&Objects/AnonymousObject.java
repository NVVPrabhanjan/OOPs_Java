public class AnonymousObject {

    public static void main(String[] args) {

        new Student().age = 30; // Anonymous object

        new Student().print(); // Anonymous object
    }
}

class Student {

    String name;
    int age;

    void print() {
        System.out.println(age);
        System.out.println(name);
    }

    void study() {
        System.out.println(this.name + " is studying.");
    }
}
