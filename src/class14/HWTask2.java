package class14;

public class HWTask2 {
    public static void main(String[] args) {
        String str="wefrg26^&#%FGW@T#$AQ@#Tgetfr3qgqgAE4";
        String str1=str.replaceAll("[^a-zA-Z0-9]]","");
        System.out.println(str1.length());

    }
}
