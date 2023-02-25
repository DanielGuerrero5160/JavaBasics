package class29;

import java.util.HashSet;

public class SetsDemo2 {
    public static void main(String[] args) {

        HashSet<String> fruit=new HashSet<>();
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Mango");//mango will only appear once
        //cannot add duplicate values to hashset
        //it does not maintain insertion order
        System.out.println(fruit);



    }

}
