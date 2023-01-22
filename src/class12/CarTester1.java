package class12;

public class CarTester1 {
    public static void main(String[] args) {
        Car audi=new Car();
        audi.make="Audi";
        audi.model="R8";
        audi.color="black";

        audi.moveForward();
        audi.applyBrakes();
    }
}
