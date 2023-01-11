package class6;

public class HW4 {
    public static void main(String[] args) {
        int i=20;
        //way 1
        while(i>0){
            System.out.println(i);
            i-=2;
        }
        System.out.println("************************");
        //way2
        int num=20;
        while(num>0){
           if(num%2!=0){

           }else{
               System.out.println(num);
           }
           num--;
        }
    }
}
