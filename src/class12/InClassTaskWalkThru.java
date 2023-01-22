package class12;

import java.util.Scanner;

public class InClassTaskWalkThru {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter username");
        String username= input.nextLine();
        System.out.println("Please enter password");
        String password=input.nextLine();
        System.out.println("Please confirm password");
        String passwordConf= input.next();

        if(username.isEmpty()||password.isEmpty()){
            System.out.println("Username and password cannot be empty");
        }else if(password.length()<8){
            System.out.println("Password needs to be at least 8 characters");
        }else if(password.contains(username)){
            System.out.println("password cannot contain useranme");
        }else if(!password.equals(passwordConf)){
            System.out.println("Passwords do not match");
        }
    }
}
