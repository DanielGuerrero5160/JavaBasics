package class28;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveWithIteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("Cat");
        words.add("Java");
        words.add("Computer");
        words.add("Lava");

        var name="sldngsd";//we can use var instead of declaring
        // specific datatype if java versions after java 9
        //java 9 and below cannot use var
        var num=123;
        var c='$';


        /*
         Iterator<String> iterator=words.iterator();//this is how we would have to remove elements
        //from an array list before java 8.
        while(iterator.hasNext()){
            String s= iterator.next();
            if(s.endsWith("a")){
                iterator.remove();
            }
        }
        System.out.println(words);
         */

        //from an array list before java 8.
        //this is how we would have to remove elements

        //the below is the same as above
        words.removeIf(s -> s.endsWith("a"));//s.endsWith("a") same as in loop above
        System.out.println(words);
        //we do not need to specify dataype and can replace s with anything we want.




    }
}
