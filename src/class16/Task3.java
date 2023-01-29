package class16;

public class Task3 {
    /*
    Create a method that will
    print whether given String is palindrome or not.
     */
   void isPal(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        if (str.equalsIgnoreCase(sb.toString())){
            System.out.println(str+" is a palindrome");
        }else {
            System.out.println(str+" is not a palindrome");
        }

    }

    public static void main(String[] args) {
        Task3 task3=new Task3();
        String pal="Hannah";
        task3.isPal(pal);
    }
}
