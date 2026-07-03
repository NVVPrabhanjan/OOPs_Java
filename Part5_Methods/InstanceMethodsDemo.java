package Part5_Methods;

public class InstanceMethodsDemo {
    private String name;
    private int age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Instance Method (displayDetails): Name = " + name + ", Age = " + age);
    }

    public int calculateBirthYear(int currentYear) {
        return currentYear - this.age;
    }

    public static void main(String[] args) {
        InstanceMethodsDemo obj = new InstanceMethodsDemo();
        obj.setName("Bob");
        obj.setAge(30);

        System.out.println("Using Getters: Name = " + obj.getName() + ", Age = " + obj.getAge());
        obj.displayDetails();
        System.out.println("Birth Year: " + obj.calculateBirthYear(2026));
    }
}
