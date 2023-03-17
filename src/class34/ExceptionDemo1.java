package class34;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        String name = "!Batch 15 is Smart";
        try {
            System.out.println( name.charAt(-1));
        }catch (StringIndexOutOfBoundsException iob){
            //print stack trace prints the issue on the console and also runs the complete code
            //even if an error is encounters
            //as a tester, we will always be using printstacktrace
            //iob.printStackTrace();

            //get message method below will only print out the message of the error
            //such as String index is out of range: -1
            //System.out.println(iob.getMessage());
//printing the error like below will print the complete
// //information about the exception class pluss the message
            System.out.println(iob);
            System.out.println("The index you entered is not possible. Indexes start at 0");
        }catch (NullPointerException npe){
            System.out.println(npe.getMessage());
            System.out.println("This is a null pointer Exception");
        }catch (Exception e){
            System.out.println(e);
            System.out.println("Something went wrong");
        }
        System.out.println("Rest of the program");
    }
}
