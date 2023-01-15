package class8;

public class BreakKeywordDemo1 {
    public static void main(String[] args) {
        boolean  summer=true;
        int temp=75;

        while(summer){
            if(temp<=100){
                System.out.println(" I love summer because temp is "+temp);
            }else{
                System.out.println("Its very hot "+temp);
                break;
            }
                temp+=5;
        }

boolean summer1=true;
        int temp1=75;

        while(summer1){
            if(temp1<=100){
                System.out.println("I love summer because temp is "+temp1);
            }else if (temp1>=100){
                summer1=false;
                System.out.println("It is very hot "+temp1);
            }
            temp1+=5;
        }


    }
}
