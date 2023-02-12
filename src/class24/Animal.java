package class24;

public abstract class Animal {// adding abstract here will prevent us from being able to create an instance/object of the class

    /*
    Define the speak and eat methods and create 3 subclasses and override the speak and eat methods
     */
   abstract void speak();

    abstract void eat();

    void dosuttin(){
        System.out.println("Doing something");
    }
}
class Dog extends Animal{
    @Override
    void speak() {
        System.out.println("Dog is barking");
    }

    @Override
    void eat() {
        System.out.println("Dog is eating");
    }
}
class Cow extends Animal{
    @Override
    void speak() {
        System.out.println("Cow is Mooing");
    }

    @Override
    void eat() {
        System.out.println("Cow is eating");
    }
}
class Cat extends Animal{
    @Override
    void speak() {
        System.out.println("Cat is meowing");
    }

    @Override
    void eat() {
        System.out.println("Cat is eating");
    }
}

