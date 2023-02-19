package class26;

public interface TrustAble {
int age=10;//constant
String color="sjdgs";//constant
    //by default, interface variables are public final and static
    int trust();

    static void method1(){
        System.out.println("Hello World");//we can have static methods with a body in interfaces
        //if we want to have a method body in an interface, the method needs to be static
        //but we can also have default methods in static interfaces

    }
    default void method2(){
        System.out.println("Default method");
    }
    //we can also have default methods in interfaces
private void method3(){
    System.out.println("Private method");
}
//we can also have private methods in interfaces
}
