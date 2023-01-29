package class14;
import java.util.Scanner;
public class MethodDemo2 {

    void printHello(){
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
    }
    void printHelloManyTimes(int times){
        //to call this method above we need to add the declared
        //of int times, se we would call it like object.PrinthelloManyTimes(10)
        for (int i = 0; i < times; i++) {
            System.out.println("yo");
        }
    }
    void printManyTimes(int times,String word){
        for (int i = 0; i < times; i++) {
            System.out.println(word);

        }
    }
}
