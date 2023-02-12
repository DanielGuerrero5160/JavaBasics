package class24;

public class AnimalTester {
    public static void main(String[] args) {
        Animal[] arr={new Dog(),new Cat(), new Cow()};
      //  Animal animal=new Animal(); cannot create an object of an abstract class
        for(Animal a:arr){
            a.eat();
            a.speak();
        }

    }
}
