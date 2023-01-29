package class16;

public class Task5 {
    /*
    Write a method to return whether a number is prime or now
     */
    boolean isPrime(int num){
        boolean flag=true;
        if (num>1){
            for (int i = 2; i < num; i++) {
                if (num%i==0){
                    flag=false;
                    break;
                }
            }
        }else{
            flag=false;
        }
        return flag;
    }

    public static void main(String[] args) {
        Task5 task5=new Task5();
        int numGiven=1;
        System.out.println(numGiven+" is prime? "+task5.isPrime(numGiven));
    }

}
