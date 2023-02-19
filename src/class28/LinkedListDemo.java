package class28;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<String> names=new LinkedList<>();
        names.add("Daniel");
        names.add("Jimmy");
        names.add("Jake");

       for (String x:names){
           System.out.println(x);
       }
    }
}
