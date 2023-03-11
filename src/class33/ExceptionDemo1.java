package class33;

public class ExceptionDemo1 {
    public static void main(String[] args) {


            System.out.println("Line 1");
            System.out.println("Line 2");
            System.out.println("Line 3");
            System.out.println("Line 4");
            System.out.println("Line 5");
            System.out.println("Line 6");
            try {
                //here we put the code whihc might throw an error
                String str="Java";
                str.charAt(10);//string index out of bound error
               // int[] arr=new int[-5];
                System.out.println(10/0);
              // String name=null;
             //  System.out.println(name.length());//null pointer exception
            } catch (NullPointerException npe){
                System.out.println("We are trying to access a method on a null object");
            } catch (ArithmeticException e){
                System.out.println("Someone is trying to divide by 0");
            }catch (Exception e){
                System.out.println("Something went wrong");
            }
        System.out.println("Line 7");
            System.out.println("Line 8");
            System.out.println("Line 9");

    }
}
