package class30;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapsDemo6 {
    public static void main(String[] args) {
        Map<Integer,String> students=new HashMap<>();
        students.put(1,"Daniel");
        students.put(2,"Savo");
        students.put(3,"Anush");
        students.put(4,"Julia");
        students.put(5,"Saud");

        Collection<String> values=students.values();//we can store values in Collections
         //as sets are a part of the collections' framework.

        Set<Entry<Integer,String>> entrySet=students.entrySet();
        //the above creates an object of a class called Entry and stores the keys and values of a Map
        //in different objects
        for(Entry<Integer,String> entry: entrySet){
            //System.out.println(entry.getKey());gets all keys from Map
            //System.out.println(entry.getValue());//gets all values from map
            //System.out.println(entry.getKey()+" "+entry.getValue());//gets both keys and values at the same time

        }

        //removes entries if key is greater than 2 and contains the letter "i"
        entrySet.removeIf(x->x.getKey()>2&&x.getValue().contains("i"));
        System.out.println(students);




    }
}
