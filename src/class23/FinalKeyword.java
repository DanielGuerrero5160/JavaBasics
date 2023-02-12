package class23;

public final class FinalKeyword {//a final class cannot be inherited by another class-no subclasses
    //final keyword has 3 uses

    //first use is with variables

    final double gravity=9.8;
    final double pi=3.14159;
    final double lightSpeed=299792458;


    //second use is final with methods

   final void tryChangingGravity(){
       // gravity=1.6;//We cannot change a final variable
        System.out.println("Testing");
    }
}
//class Child extends FinalKeyword{//We cannot extend a subclass to a parent class that has final keyword
    //final void tryChangingGravity(){//we cannot override a final method
        // gravity=1.6;//We cannot change a final variable
       // System.out.println("Testing");

    //}

