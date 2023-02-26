package class30;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class InClassTask {
    public static void main(String[] args) {
        /*
        Create a map of countries with its capital that will
        store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.
         */

        Map<String,String> countries=new TreeMap<>();
        countries.put("USA","Washington DC");
        countries.put("Spain","Madrid");
        countries.put("Brazil","Sao Paulo");
        countries.put("Mexico","Mexico City");

       //Set<Map.Entry<String,String>> entryset=countries.entrySet();
       var entrySet=countries.entrySet();
       for(var entry:entrySet){
           System.out.println(entry.getKey()+" ="+entry.getValue());
       }
        System.out.println("*********With Iterator********");

       var iterator=countries.entrySet().iterator();
       while(iterator.hasNext()){
           var entry=iterator.next();
           System.out.println(entry.getKey()+" "+entry.getValue());
       }



    }
}
