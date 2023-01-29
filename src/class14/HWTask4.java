package class14;

public class HWTask4 {
    public static void main(String[] args) {
        /*
         How would you reverse a String word by word? for example
           // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever
         */

        String str="This is sentence I want to reverse";
        String[] strArr=str.split(" ");
        for (String word:strArr){
            for (int i = word.length()-1; i >=0 ; i--) {
                System.out.print(word.charAt(i));

            }
            System.out.print(" ");

        }
        System.out.println();

        String str1="This is sentence I want to reverse";
        String[] str1Arr=str.split(" ");
        StringBuilder sb=new StringBuilder();
        for(String x:str1Arr){
            StringBuilder sb1=new StringBuilder(x);
            sb1.reverse();
            System.out.print(sb1);
            System.out.print(" ");

        }
        System.out.println();
        for(String word:str1Arr){
            System.out.print(new StringBuilder(word).reverse()+" ");
        }

    }
}
