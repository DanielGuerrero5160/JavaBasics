package class27;

import java.util.ArrayList;

public class Demo8 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        //using add method to add elements to this arraylist.
        names.add("Daniel");
        names.add("Saud");
        names.add("Zafar");
        names.add("Nelson");
        System.out.println(names);
        names.clear();//this method deletes everything from the arrayList
        System.out.println(names);
    }
}
