package class29;

import java.util.LinkedHashSet;

public class SetsDemo3 {
    public static void main(String[] args) {
//does not allow duplicates and maintains insertain order
        LinkedHashSet<String> fruit=new LinkedHashSet<>();
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Banana");
        fruit.add("Apple");
        fruit.add("Mango");//all sets will not allow duplicates

        System.out.println(fruit);//LinkedHashSet maintains the insertion order/
        //regular hashset does not maintain insertion order, and it's very fast




    }
}
