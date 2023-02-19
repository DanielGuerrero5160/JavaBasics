package class28;

import java.util.ArrayList;

public class Demo1Iterators {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("Cat");
        words.add("Java");
        words.add("Computer");
        words.add("Lava");

        /*
       for(String s:words){//we cannot use normal for loop or enhanced
           // for loop or while loop to perform
           // any operation on arrays which can modify the size of the array
           EX: We cannot use add or remove.
           if(s.endsWith("a")){
               words.remove(s);

           }

        }
*/


    }
}
