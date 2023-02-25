package class29;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {
    public static void main(String[] args) {
        ArrayList<Double> numbers=new ArrayList<>();
        numbers.add(10.0);
        numbers.add(15.2);
        numbers.add(20.0);
        numbers.add(30.5);
        numbers.add(40.5);
        numbers.add(10.3);
/* this loop does not work as it does not account for the size change of the arraylist
        for(Double number:numbers){
            if(number>11.0){
                numbers.remove(number);
            }
        }
 */
        //numbers.removeIf(i->i>11.0);//lamda expressions
        //System.out.println(numbers);

        Iterator<Double> iterator=numbers.iterator();
        /*ystem.out.println(iterator.hasNext());//this will check if there is a next element in the list
        System.out.println(iterator.next());//this will move the pointer to the next element
        System.out.println(iterator.hasNext());///then it will check if after the pointer moved, if there is a next element.
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
         */
        while (iterator.hasNext()){
            double number= iterator.next();
            if(number>11){
                iterator.remove();
            }
        }
        System.out.println(numbers);




    }
}
