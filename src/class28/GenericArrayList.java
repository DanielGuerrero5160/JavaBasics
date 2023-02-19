package class28;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericArrayList {

    Object a=new String("Some Value");
    Object b=new Integer(10);
    Object c=new Scanner(System.in);

    //The above shows that every class has Object class as a super class.
    // Every class is a subclass of Object class by default
    public static void main(String[] args) {

       // ArrayList<String> name=new ArrayList<>();//this is a generic arrayList,
        // where we define the object type

        ArrayList name=new ArrayList();  //this is how they created arraylists before Java 5
       name.add("Zafar");
        name.add(10);
        name.add('a');

        // the above is called non-generic arrayList can cause many run time errors nad complicate the code
        //We almost never want to do this.
        //it is hard to perform operations with arraylists that have different objects/types of data.
//no one now should ever use this.
        for (Object x:name){
            //x.toString();
            ((String)x).trim();
        }



    }
}
