package Part3_Constructors;

public class DefaultConstructor {
    public static void main(String[] args) {
        example s1 = new example();
        System.out.println(s1.a);
    }
}

class example {
    int a;
}

// If you write any constructor, the compiler does not generate the default
// constructor.