package Part9_Encapsulation;

public class WriteOnly {
    public static void main(String[] args) {

        Password p = new Password();

        p.setPassword("********");

        // System.out.println(p.getPassword()); // ERROR
    }
}

class Password {

    private String password;

    public void setPassword(String password) {

        this.password = password;
    }
}