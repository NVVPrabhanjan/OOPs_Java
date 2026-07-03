package Part7_StaticKeyword;

import static java.lang.Math.*;

public class StaticImportDemo {
    public static void main(String[] args) {
        // Without static import, we would write Math.sqrt(25) and Math.pow(2, 3)
        System.out.println("Square root of 25: " + sqrt(25));
        System.out.println("2 raised to the power 3: " + pow(2, 3));
    }
}
