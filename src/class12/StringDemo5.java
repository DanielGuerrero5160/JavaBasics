package class12;

public class StringDemo5 {
    public static void main(String[] args) {
        String str="java";
        String str2="Java";
        boolean areEqual=str.equals(str2);//checks if two strings are equal or not-case sensitive
        System.out.println(areEqual);
        boolean areEqualIgnoreCase=str.equalsIgnoreCase(str2);//checks if two strings are equal and is not cases sensitive
        System.out.println(areEqualIgnoreCase);

    }
}
