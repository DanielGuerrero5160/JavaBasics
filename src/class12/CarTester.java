package class12;

public class CarTester {
    public static void main(String[] args) {

        Car bmw = new Car();
        bmw.make = "BMW";
        bmw.model = "i7";
        bmw.year = 2023;
        bmw.color = "Grey";

        bmw.moveForward();
        bmw.applyBrakes();


    }
}
