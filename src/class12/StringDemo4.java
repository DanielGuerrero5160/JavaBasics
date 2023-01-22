package class12;

public class StringDemo4 {
    public static void main(String[] args) {
        String str = "  ";
        boolean isEmpty = str.isEmpty();
        System.out.println(isEmpty);

        System.out.println(str.isEmpty());//if there is nothing in a string -the is.Empty method will return true.
        //if there is something in the string, it will return false as it is not empty
        System.out.println(str.isBlank());//it will return true if the string is just spaces
    }
}
