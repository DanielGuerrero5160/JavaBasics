package class11;

public class CatTester {
    public static void main(String[] args) {
        Cat maxi=new Cat();
     maxi.name="lego";
     maxi.bread="Van cat";
     maxi.age=5;
     maxi.color="Pink";
        maxi.speak();
        maxi.eat();
        maxi.attitude=false;


        Cat jay=new Cat();
        jay.name="Jay";
        jay.age=7;
        jay.color="Black";
        jay.bread="Domestic";

        jay.eat();
        jay.speak();

    }
}
