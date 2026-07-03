package Part10_Inheritance;

public class Main1 {

    public static void main(String[] args) {

        Developer d = new Developer();

        System.out.println(d.company);

        d.work();

        d.code();
    }
}

class Employee {

    String company = "ThoughtWorks";

    void work() {

        System.out.println("Working");
    }
}

class Developer extends Employee {

    void code() {

        System.out.println("Coding");
    }
}
