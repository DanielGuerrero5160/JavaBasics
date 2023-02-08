package class21;

public class Animal {
    String name;
    String color="black";


}
class Cat extends Animal{
    String color="white";
    int age;
    double weight;

    void printColor(){
        System.out.println(super.color);//will print black-super class
        System.out.println(this.color);//will print white-this class
    }


}
class AnimalTester{
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.printColor();

    }
}
