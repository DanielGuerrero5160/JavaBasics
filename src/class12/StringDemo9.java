package class12;

public class StringDemo9 {
    public static void main(String[] args) {
        String str="jsdjgfnsl  1234 $%^&&";
        int sum=0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){///Checks how many numbers are in a string
                //isAlphabetic() for letters
                //Character. is a class
                sum++;
            }
        }
        System.out.println("Total isDigit in str is " +sum);
    }
}
