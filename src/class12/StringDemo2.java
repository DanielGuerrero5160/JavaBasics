package class12;

public class StringDemo2 {
    public static void main(String[] args) {
        //only converts the upper case letters to lower case
        String str="JAVA IS FUN";
       String newStr=str.toLowerCase();//toLowerCase method has no input but outputs a String
        System.out.println(newStr);

        String str2="i love java";
        String str3=str2.toUpperCase();
        System.out.println(str3);

    }
}
