package class16;

public class TernaryOperator {
    public static void main(String[] args) {
        int number=0;
        if(3>2){
            number=10;
        }else{
            number=20;
        }
        System.out.println(number);
        System.out.println("*************another way below");
int number1=0;
        number1=(3>2) ?10:20;//if condition is true it prints number=10, if false, number=20
number1=(3>2)?(4>5) ?15:65:20;
        System.out.println(number1);


    }
}
