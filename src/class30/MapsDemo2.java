package class30;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo2 {
    public static void main(String[] args) {

        Map<String,Double> fruit=new HashMap<>();
        fruit.put("Apple",1.99);
        fruit.put("Orange",2.99);
        fruit.put("Banana",1.55);
        fruit.put("Apple",1.10);//since no duplicate keys are allowed,
        //the second declaration of the key replaces the first value;
        fruit.put(null,null);
        System.out.println(fruit);

        Map<String,Double> makeup=new HashMap<>();
        makeup.put("Lipstick",50.0);
        makeup.put("foundation",40.0);
        makeup.put("mascara",70.0);
        makeup.put("eyeliner",12.2);
        makeup.put("Blush",12.2);

        HashMap<String,Double> groceries=new HashMap<>();
        groceries.putAll(fruit);//adding all entries from fruit map
        groceries.putAll(makeup);//adding all entries from makeup map
        System.out.println(groceries);



    }
}
