package Part6_ThisKeyword;

public class This {

    String name;

    void display() {
        System.out.println(this.name);
    }

    public static void main(String[] args) {

        This s = new This();

        s.name = "Prabhanjan";
        System.out.println(s.name);

        s.display();
    }
}
