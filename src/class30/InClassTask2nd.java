package class30;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class InClassTask2nd {
    /*
   Create a map of countries with its capital that will
        store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.
     */

    public static <Set> void main(String[] args) {
        Map<String,String> countries=new TreeMap<>();
        countries.put("USA","Washington DC");
        countries.put("Spain","Madrid");
        countries.put("Brazil","Sao Paulo");
        countries.put("Mexico","Mexico City");

        var values=countries.values();
        for(var value:values){
            System.out.println(value);
        }
        System.out.println("With Iterator******************");
        var iterator=countries.values().iterator();
        while(iterator.hasNext()){
            var value=iterator.next();
            System.out.println(value);
        }


    }
}
