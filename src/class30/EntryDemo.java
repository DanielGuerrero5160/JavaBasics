package class30;

import java.util.LinkedHashSet;
import java.util.Set;

public class EntryDemo {
    public static void main(String[] args) {
        Set<Entry> entrySet=new LinkedHashSet<>();
        entrySet.add(new Entry(1,"Nezir"));
        entrySet.add(new Entry(2,"Shah"));
        entrySet.add(new Entry(3,"Tami"));
        entrySet.add(new Entry(4,"Aisha"));
        entrySet.add(new Entry(5,"Gul"));
        entrySet.add(new Entry(6,"Bahar"));
        entrySet.add(new Entry(7,"Saba"));
        //remove objects that are greater than element 2 that have "i" in the value

        entrySet.removeIf(x->x.getKey()>2&&x.getValue().contains("i"));
       for(Entry e:entrySet){
           System.out.println(e);

       }

    }
}
