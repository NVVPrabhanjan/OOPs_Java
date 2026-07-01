class Car {

    String brand;
}

public class ObjectReference {

    public static void main(String[] args) {

        Car car1 = new Car();

        car1.brand = "BMW";

        Car car2 = car1;

        car2.brand = "Audi";

        System.out.println(car1.brand);
    }
}