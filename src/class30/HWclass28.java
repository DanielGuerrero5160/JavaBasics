package class30;

import java.util.ArrayList;

public class HWclass28 {
/*
reate a class Insurance that will have an attribute as
insuranceName and unimplemented behaviour
as getQuote and cancelInsurance. Create 3 subclasses Car, Pet, Health.
Car class has it’s own attribute as carModel and Class Pet has petType attribute.

Create 3 objects of the sub classes and store them in ArrayList.
Using for loop/advanced for loop/ iterator access all methods of the class.
 */

}
abstract class Insurance{
    String insuranceName;

    public Insurance(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public abstract void getQuote();
    public abstract void cancelInsurance();
}
class Car extends Insurance{
    String carModel;
    public Car(String insuranceName,String carModel) {
        super(insuranceName);
        this.carModel=carModel;
    }

    @Override
    public void getQuote() {
        System.out.println(carModel+" insurance is 3400 per year");
    }

    @Override
    public void cancelInsurance() {
        System.out.println("You can cancel your car insurance any time you want without penalty");
    }
}
class Pet extends Insurance{
    String petType;
    public Pet(String insuranceName,String petType) {
        super(insuranceName);
        this.petType=petType;
    }

    @Override
    public void getQuote() {
        System.out.println("Pet insurance for "+petType+" is 2000 a year");
    }

    @Override
    public void cancelInsurance() {
        System.out.println("cancel any time");
    }
}
class Health extends Insurance{
    public Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    public void getQuote() {
        System.out.println("Here is your quote");
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Cancel anytime!");
    }
}
class InsuranceTester{
    public static void main(String[] args) {
        ArrayList<Insurance> ins=new ArrayList<>();

    }
}
