package Part9_Encapsulation;

public class Getters_Setters {

    public static void main(String[] args) {

        Student s = new Student();

        s.setName("Rahul");

        s.setAge(20);

        System.out.println(s.getName());

        System.out.println(s.getAge());
    }
}

class Student {

    private String name;

    private int age;

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setAge(int age) {

        if (age > 0)

            this.age = age;
    }

    public int getAge() {

        return age;
    }
}