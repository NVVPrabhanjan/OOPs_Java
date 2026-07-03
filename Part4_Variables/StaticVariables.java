package Part4_Variables;

public class StaticVariables {
    public static void main(String[] args) {
        Variable a = new Variable();
        Variable b = new Variable();
        a.a = 5;
        a.print();
        b.a = 67;
        b.print();
        a.print();
    }
}

class Variable {
    static int a = 2;

    void print() {
        System.out.println(a);
    }
}
// A static variable belongs to the class, not to any individual object.
// Static variables are stored in the Method Area (Class Area/Metaspace).
// Only one copy exists, shared by all objects.