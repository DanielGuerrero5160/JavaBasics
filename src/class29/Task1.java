package class29;

import java.util.ArrayList;

public class Task1 {
/*
reate an ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that
 */
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Daniel");
        names.add("Jimmy");
        names.add("Julia");
        names.add("Rich");
        names.add("Tom");

        System.out.println(names.isEmpty());
        System.out.println(names.contains("Julia"));
        System.out.println(names.size());
        System.out.println(names);
    }
}
