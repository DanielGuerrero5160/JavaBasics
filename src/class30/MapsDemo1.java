package class30;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo1 {
    public static void main(String[] args) {
        Map<Integer,String> students=new HashMap<>();//cannot have duplicate keys
        //if we do have a duplicate key, it will replace the value
        // of the first declaration
        // of the key with the new one
        students.put(1,"Daniel");
        students.put(2,"Savo");
        students.put(3,"Anush");
        students.put(4,"Julia");
        students.put(5,"Saud");

        System.out.println(students.get(4));//getting Julia by calling get method with the index

        System.out.println(students.size());//finding the size of the map with size method

        System.out.println(students.containsKey(6));//checking if the map has a key 6
        //returns false because map only goes up to 5

        System.out.println(students.containsValue("Daniel"));//search map to see if it contains a certain value

        System.out.println(students.remove(3));//removing value and key of 3rd key

        System.out.println(students);

        students.replace(2,"Fayed");
        System.out.println(students);
    }
}
