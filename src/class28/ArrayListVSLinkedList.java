package class28;

import java.util.ArrayList;

public class ArrayListVSLinkedList {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();

       ArrayList<String> numbers=new ArrayList<>();
        for (int i = 0; i < 100000; i++) {//the time it takes this operation with linked list is 5 milliseconds
            numbers.add(0,"Test Data");


        }
        long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);

//the time it takes this operation with linked list is 5 milliseconds
        //the time it takes with an ArrayList is 507

    }
}
