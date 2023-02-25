package class29;

import java.util.ArrayList;

public class ArrayListDemo1 {

    public static void main(String[] args) {

        ArrayList<Dog> dogs=new ArrayList<>();
        Dog d1=new Dog("Jacky","Persian",15);
        dogs.add(d1);

        dogs.add(new Dog("Jami","German",5));
        dogs.add(new Dog("Kiko","Italian",3));
        dogs.add(new Dog("Tinko","Russian",4));

        for(Dog d:dogs){
            d.printDogName();
        }

    }
}
