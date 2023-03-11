package class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo5 {
    public static void main(String[] args) throws FileNotFoundException {
        //when we use the throws keyword with the exception, it will throw the
        //exception on someone else, and they will either need to throw it for
        //use a try catch block
        //it specifies to the caller what exceptions can be 

            FileInputStream fileInputStream = new FileInputStream("");

    }
}
