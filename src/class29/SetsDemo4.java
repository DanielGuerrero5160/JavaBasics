package class29;

import com.sun.source.tree.Tree;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetsDemo4 {
    public static void main(String[] args) {

        TreeSet<String> fruit=new TreeSet<>();
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Banana");
        fruit.add("Apple");
        fruit.add("Mango");//all sets will not allow duplicates

        System.out.println(fruit);//Tree set sorts the data, for this example, arranges elements
        //by alphabetical order.

        TreeSet<Integer> nums=new TreeSet<>();
      nums.add(50);
      nums.add(100);
      nums.add(511);
      nums.add(50);//tree set also removes duplicates
      nums.add(5023);
      nums.add(5045);
        System.out.println(nums);//sorted by increasing or smallest to largest order

    }
}
