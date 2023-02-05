package class20;

public class BaseClass {
    String name="John";

    void hello(){
        System.out.println("hello method from BaseClass");
    }
}
class ChildClass extends BaseClass{

    String name="Jane";

    void callMe(){
        System.out.println(super.name);//will print name from base/parent class
        System.out.println(name);//will print name from child/subclass
        System.out.println(super.name);//we can use super in other lines than first when calling variables
    }

    void hello(){
        System.out.println("hello method from Child Class");
    }
    void callingParentMethod(){
        super.hello();//using super to call method in parent class
        hello();//this is the hello method from the child class
    }


}
