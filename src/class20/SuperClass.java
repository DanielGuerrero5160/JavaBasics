package class20;

public class SuperClass {

    SuperClass() {
        System.out.println("I am a constructor from the parent class (SuperClass");

    }
}
    class SubClass extends SuperClass{// if we take away the extends, only child Subclass constructor will be displayed
SubClass(){
   // super();//makes a call to the parent class constructor//super needs to be the first line in the constructor
    //even if we comment out the super(); above, compiler will still assume its still there because the subclass extends SuperClass
    System.out.println("I am a child constructor");
    //whether we call super or not, it will always be there by default
    //we cannot create a SuperClass constructor here as it needs to be in the SuperClass class. It cannot be in child class
    //from the child class constructor, there is always a call made to the parent class constructor using super(if we type it or not).


}

}
