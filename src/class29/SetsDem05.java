package class29;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetsDem05 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(30);



       LinkedHashSet<Integer> numbers1=new LinkedHashSet<>(numbers);
        System.out.println(numbers1);

    }
}
