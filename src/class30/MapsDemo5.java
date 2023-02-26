package class30;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapsDemo5 {
    public static void main(String[] args) {
        Map<Integer,String> students=new HashMap<>();
        students.put(1,"Daniel");
        students.put(2,"Savo");
        students.put(3,"Anush");
        students.put(4,"Julia");
        students.put(5,"Saud");


        //Remove all keys from the above map if they a greater than 2
//longer way
       /* Set<Integer> allKeys=students.keySet();
        allKeys.removeIf(k->k>2);

        System.out.println(students);
        */
       // shorter way
        students.keySet().removeIf(s->s>2);
        System.out.println(students);
    }
}
