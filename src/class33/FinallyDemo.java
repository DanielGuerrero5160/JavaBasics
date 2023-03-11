package class33;

public class FinallyDemo {
    public static void main(String[] args) {
        System.out.println("1");
        try {
            System.out.println("2");
           // System.out.println(10/0);
            String name=null;
            name.length();
            System.out.println("3");
        }catch (ArithmeticException ae){
            System.out.println("4");
            System.out.println(10/0);
            System.out.println("5");
        }
        //the final block will always be executed even if the error would normally stop the program from running
        finally {
            System.out.println("Will always be executed no matter the exceptions");
        }
        System.out.println("6");//this will not be printed as
        // there is no catch block for line 14

    }
}
