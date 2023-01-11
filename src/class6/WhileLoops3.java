package class6;
import java.util.Scanner;
public class WhileLoops3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number= input.nextInt();
        while(number>0){
            System.out.println(number);
            number--;
        }
    }
}
