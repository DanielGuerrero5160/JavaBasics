package class13;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder("Sunday");
        System.out.println(stringBuilder.reverse());

        String state="VA";//Java reserves a memory box for each variable
        String state2="VA";//Java reserves a memory box for each variable
        //string builder class does not search the memory before creating a variable so it is super fast
        //String builder is fast but takes more memory
        //When looking to save space and speed of program is not a concern, we will be using string class.
        //String class is slow but saves a lot of memory because it will check all other variables, and if existing duplicate strings exist
        //it will not reserve a new box in the memory, but will reserve in the one box the first duplicate was stored in.
        // if one of those duplicate strings is changed, a new box will be created in the memory instead of changing all duplicates.


    }
}
