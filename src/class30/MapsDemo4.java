package class30;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapsDemo4 {
    public static void main(String[] args) {
        Map<String,Double> makeup=new HashMap<>();
        makeup.put("Lipstick",50.0);
        makeup.put("foundation",40.0);
        makeup.put("mascara",70.0);
        makeup.put("eyeliner",12.2);
        makeup.put("Blush",12.2);
//to get all the keys from a map, we can use the KeySet method from Map interface.
        Set<String> allKeys=makeup.keySet();
        System.out.println(allKeys);

        for(String s:allKeys){
            System.out.println(s);
        }

        allKeys.removeIf(s->s.length()>7);//removing values from the set that is
        //made by the map, it will also remove those values from the map.
        //so anything you do to the set will also happen to the map
        System.out.println(allKeys);

        System.out.println(makeup);
    }
}
