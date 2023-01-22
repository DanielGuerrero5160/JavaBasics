package class12;

public class StringDemo11 {
    public static void main(String[] args) {
        String str="Send it to support channel. More Java";
        String newStr=str.substring(28);//will give the original string but only starting after specified index
        System.out.println(newStr);//This prints the substring which is the original string starting at the specified index

        System.out.println(str.substring(0,26));//This gives the starting point first and ending point second of the substring
    }
}
