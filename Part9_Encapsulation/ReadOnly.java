package Part9_Encapsulation;

public class ReadOnly {
    public static void main(String[] args) {

        Student s = new Student();

        System.out.println(s.getCollege());

        // s.setCollege("MIT");
    }
}

class Student {

    private String college = "BMSCE";

    public String getCollege() {

        return college;
    }
}

// No setter because it is readonly class