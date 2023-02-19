package class27;

import java.util.ArrayList;

public class Demo3 {
    public static void main(String[] args) {
        //creating an arraylist of strings
        //<> these are called diamond operator or angle brackets-
        // and we specify the data type of the array list inside the diamond.
        ArrayList<String> names=new ArrayList<>();
        //using add method to add elements to this arraylist.
        names.add("Daniel");
        names.add("Saud");
        names.add("Zafar");
        names.add("Nelson");
        System.out.println(names);

        System.out.println(names.contains("Daniel"));
    }
}
