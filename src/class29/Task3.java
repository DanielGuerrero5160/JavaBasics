package class29;

import java.util.ArrayList;

public class Task3 {
    /*
    Create an arrayList of words. Remove every word that ends with “e”.
     */
    public static void main(String[] args) {

        ArrayList<String> words=new ArrayList<>();
        words.add("Hello");
        words.add("Skateboard");
        words.add("Thrasher");
        words.add("Daniel");
        words.add("goodbye");

        //words.removeIf(x->x.endsWith("e"));//removing an an element contains letter e
        words.removeIf(x->x.contains("e"));//removes if a element contains e
        System.out.println(words);
    }
}
