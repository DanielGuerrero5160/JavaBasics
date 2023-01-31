package class15;

public class Dog {
    String name;//instance variable, because it is inside the class, but outside of a method
    String color;//instance variable

    static int noOfLegs=4;//Static variable-inside class and outside of method
    void printFood(){
        System.out.println(name);//because name is an instance variable, we can use it inside the class without initializing
        String food="meat";//local variable-Variable is defined in a method only
        System.out.println(food);

        String str="computer science";
        System.out.println(str.replace("c","*"));
    }
}
