package class27;

import java.util.ArrayList;

public class Demo4 {

    public static void main(String[] args) {

        /*
        int=>Integer
        double=>Double
        boolean=>Boolean
        byte=>Byte
        float=>Float
        char=>Character
        long=>Long
        When use write the datatype in the <> in arraylists, we cannot use
        primitive datatype, we need to use the reference type which has the upper case first letter
        These are classes that java developers made which are equivalent to the primitive types

         */

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(111);
        numbers.add(22);
        numbers.add(356);
        numbers.add(434);
        System.out.println(numbers);

    }
}
