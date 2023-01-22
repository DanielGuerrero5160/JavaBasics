package class12;

public class StringDemo {
    public static void main(String[] args) {
        //Creating an object of the string class
        String strObj=new String("Java");
        //another way of creating an object of the sting class - Shortcut
        //Mostly this is how we create the object of the String class
        String strObj2="java";
        System.out.println(strObj2.length());//Tells length(in the form of a number) of the string
String str="Banana ";
        int length=str.length();//String the number of characters of a sting into an int
        System.out.println(length);
        String name="Rafikgggggd";
        if(name.length()>10){
            System.out.println("Name cannot be more than 10 letters");
        }

    }
}
