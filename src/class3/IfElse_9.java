package class3;

public class IfElse_9 {
    public static void main(String[] args) {

        char c='M';
        if(c=='M'){
            System.out.println("male");
        }
        String name="Bill";
        //with non primitave data types like String, we can't use == symbol
        if(name.equals("Sam")){
            System.out.println("Amazing Student");
        }
        //The below ! symbol is refersing the statement - if name does not equal same, print SAS
        if(!name.equals("Sam")){
            System.out.println("Super Amazing Student");
        }
    }
}
