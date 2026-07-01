public class Objects {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Rahul";
        s1.age = 20;
        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);
        s1.study();
    }
}

class Student {

    String name;
    int age;

    void study() {
        System.out.println(this.age);
        System.out.println(this.name + " is studying.");
    }
}
