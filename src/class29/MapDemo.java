package class29;

import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {

        HashMap<String,Integer> groceries=new HashMap<>();
        //maps use put method instead of add, as we need to give the key and value
        groceries.put("Eggs",10);
        groceries.put("Milk",5);
        groceries.put("Bread",5);
        groceries.put("Rice",6);
        groceries.put("Meat",7);
        groceries.put("Soap",5);

        System.out.println(groceries.get("Rice"));//calling the key using
        // the get method to print a value

//methods present inside the maps
        System.out.println(groceries.isEmpty());
        System.out.println(groceries.size());
        groceries.remove("Milk");//key and value will be removed



        //There is a linkedHashMap if we want to maintain order of entry
//TreeHashMap organizes the data -string alphabetical, numbers by lower to higher


    }
}
