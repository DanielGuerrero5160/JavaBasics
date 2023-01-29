package class13;

public class StringRecap {
    public static void main(String[] args) {
        String str="Java is great";
        //prints each char of sting on a new line using charAt method
        int sumA=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a'){
                sumA++;
            }
        }
        System.out.println(sumA);
    }
}
