package class13;

public class ReplaceAllMethodDemo {
    public static void main(String[] args) {
        String str="oJgOmHHYOnbgdj45678s$%#$%%<S:{R>DF>FS";
        System.out.println(str.replaceAll("[A-Z]","#"));
        //replace all upper case letters from a to z
        System.out.println(str.replaceAll("[a-zA-Z]","#"));
       // replace all lower and upper case letters from a-z with #
        System.out.println(str.replaceAll("[^0-9]","#"));
       // replace everything except numbers
        System.out.println(str.replaceAll("[^a-zA-z0-9]","#"));
        //replace everything except numbers and letters a-z upper or lower case
        System.out.println(str.replaceAll("[A-Z]",""));
        //if the replacement is empty double quotes, it will remove the specified characters from the string
        //to replace multiple things, we just add them in the square brackets like below
        //[a-zA-z] or [0-9a-z
        //We can use the carrot ^ symbol as a not like the logical not !

    }
}
