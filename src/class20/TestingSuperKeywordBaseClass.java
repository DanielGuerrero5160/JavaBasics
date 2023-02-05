package class20;

public class TestingSuperKeywordBaseClass {
    public static void main(String[] args) {
        ChildClass child=new ChildClass();
        child.callMe();//prints name from base and child class as super
        // keyword is used in the first sout with name
        //and then second sout with name is referring to child class

        child.callingParentMethod();//calls both hello method from child class and parent class.
        // Because this method has super.hello() for parent hello method, and regular hello(); from child class
    }
}
