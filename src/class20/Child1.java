package class20;

public class Child1 extends Parent {

    public static void main(String[] args) {
        Child1 c1=new Child1();
        c1.hello();
        Parent.bye();//static method can be called with parent class
        c1.bye();//static method can be called with child or subclass too with inheritance
        bye();//static method can be called without a class
        //c1.money(); cannot use as this is a private method
        c1.name="Daniel";
        Parent.lastName="Guerrero";// can use a static instance variable by parent class
        c1.lastName="Guerrero";//can use static instance variable from child class too
        lastName="Guerrero";//we can also use static instance variable without useing a class
        //The right way is to use static variables with parent class, not child class, but sometimes its ok to use with child class
        //with inheritance, it is available to parent and child-Everyone participates


    }
}
