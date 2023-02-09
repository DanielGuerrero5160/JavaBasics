package class22;

public class Animal {
    String name;
    String color;
    int age;

    Animal(String name,String color,int age){
        this.name=name;
        this.color=color;
        this.age=age;
    }
    void speak(){
        System.out.println("Animal Speak");
    }

}

class Dog extends Animal{
    Dog(String name,String color,int age){
        super(name, color, age);
    }
    void speak(){
        System.out.println("bark");
    }
}
class Cat extends Animal{
    Cat(String name,String color,int age){
        super(name, color, age);
    }
    void speak(){
        System.out.println("meow");
    }
}
class tester{
    public static void main(String[] args) {
        Dog dog=new Dog("spot","Black",10);
        dog.speak();
        Cat cat=new Cat("Max","White",4);
        cat.speak();
    }
}

