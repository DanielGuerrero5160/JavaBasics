package class15;
import class16.Person;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class PersonTester {
    public static void main(String[] args) {
        Person person = new Person();
       person.printTikTokAcct();
        System.out.println(person.name);
        Scanner scanner=new Scanner(System.in);
        scanner.next();
    }
}
