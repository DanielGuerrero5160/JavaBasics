package class8;
import java.util.Scanner;
public class HW2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

      for(int i=0;i<=10;i++){
          System.out.println("apply for credit card");
         String answer= input.next();
         if(answer.equals("no")){
             continue;
         }else if(answer.equals("yes")){
             break;
         }else{
             continue;
         }
      }

    }
}
