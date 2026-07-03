package Part9_Encapsulation;

public class Validation {
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(0);
    }
}

class Student {

    private String name;

    private int age;

    public void setAge(int age) {

        if (age > 0)

            this.age = age;
    }

    public int getAge() {

        return age;
    }
}