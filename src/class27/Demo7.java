package class27;

import java.util.ArrayList;

public class Demo7 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Fizy");
        names.add("Savo");
        names.add("Tarik");
        names.add("Sam");
        names.add("Urwa");
        names.add("Abeera");

        System.out.println(names.contains("Daria"));//this contains method os from arrayList class
names.remove("Urwa");
        System.out.println(names);
        names.set(2,"Anees");//set method is to replace an index with a new value
        System.out.println(names);
        System.out.println(names.indexOf("Savo"));
        //we can use index of method of ArrayList to find the index that a certain value is stored at


    }

}
