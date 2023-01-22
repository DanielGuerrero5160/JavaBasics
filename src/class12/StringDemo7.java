package class12;

public class StringDemo7 {
    public static void main(String[] args) {
        String str="I love Java";
        boolean startsWith=str.startsWith("I");///checks if a string starts with a certain character
        System.out.println(startsWith);
        System.out.println(str.endsWith("Java"));//checks if a string ends at a specific letter or word
        System.out.println(str.toLowerCase().startsWith("i"));///method chaining is when multiple methods are called on the same line
        // methods can only be chained if they both return the same data type-String in this case

        System.out.println(str.contains("java"));///checks if a word is present in a String



    }
}
