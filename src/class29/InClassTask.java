package class29;



import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class InClassTask {
    public static void main(String[] args) {
        //how can we remove all duplicates from a list

        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");


        LinkedHashSet<String> bList=new LinkedHashSet<>(aList);
        System.out.println(bList);
    }
}
