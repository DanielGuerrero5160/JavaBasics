package class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedVsUnchecked {
    public static void main(String[] args) {
        System.out.println(10/0);//this is an unchecked exception
        //we will get an exception, but java will not know until code is run because the syntax was not correct

        //exceptions can occur because of two main reasons,
        //the mistake of programmer or because of the
        // external resources your program is dependent on

        //when exceptions occur because of human error or can be avoided by
        //simply writing good code and maybe if else conditions,
        // they are called unchecked exceptions

        try{
            FileInputStream fileInputStream=new FileInputStream("Foiles/Book1.xlsx");
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }
        FileNotFoundException e=new FileNotFoundException();
    }
}
