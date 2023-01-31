package class17;

public class HWReviewTask2 {
    /*
    Create a method that will take a String as a parameter
     and returns reversed String.
     Method should be available to all classes within your project
     and accessible by class name./
     */

    public static String revStr(String str){
        StringBuilder sb=new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {

        System.out.println(revStr("Hello"));//Since method is static, we do
        //not need to create an object, and we do not need to call it using class name since we are in class.
    }
}
