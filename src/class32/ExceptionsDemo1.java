package class32;

public class ExceptionsDemo1 {
    public static void main(String[] args) {


        System.out.println("Line1");
        System.out.println("Line2");
        System.out.println("Line3");
        System.out.println("Line4");
        System.out.println("Line5");
        System.out.println("Line6");
        try{
            System.out.println(10/0);//this line will normally stop of the rest of the code from running
            //but using this exception handling, it will show the exception, and then keep running the program
        }catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Line7");
        System.out.println("Line8");
        System.out.println("Line9");
        System.out.println("Line10");
        System.out.println("Line11");
    }
}
