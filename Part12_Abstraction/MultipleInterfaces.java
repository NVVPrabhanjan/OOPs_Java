package Part12_Abstraction;

public class MultipleInterfaces {
    public static void main(String[] args) {

        // Multiple inheritance
        Mobile m = new Mobile();
        m.click();
        m.play();
    }
}

interface Camera {

    void click();
}

interface Music {

    void play();
}

class Mobile implements Camera, Music {

    @Override
    public void click() {

        System.out.println("Photo");
    }

    @Override
    public void play() {

        System.out.println("Music");
    }
}