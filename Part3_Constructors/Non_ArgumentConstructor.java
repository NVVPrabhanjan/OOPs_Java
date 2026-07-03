package Part3_Constructors;

public class Non_ArgumentConstructor {
    public static void main(String[] args) {
        Student s = new Student();
    }
}

class Student {

    Student() {
        System.out.println("Object Created");
    }
}