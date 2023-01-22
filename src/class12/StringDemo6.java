package class12;

public class StringDemo6 {
    public static void main(String[] args) {
        String str="   Java   ";
        System.out.println(str.trim());//This method trims off the spaces surrounding a string
        //it does not remove spaces within a string like "   J A V A" -It will only remove staring or ending spaces.

    }
}
