package class12;

import java.util.Scanner;

public class InClassTask {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        System.out.println("Please enter username");
        String username= input.next();
        System.out.println("Please enter password");
        String password= input.next();
        System.out.println("Please confirm password");
        String confirmedPassword= input.next();

        if(username.isEmpty()&&password.isEmpty()){
            System.out.println("Username and password cannot be empty");
            return;
        }else if(password.length()<8){
            System.out.println("Password is too short");
            return;
        }else if(password.contains(username)){
            System.out.println("Password cannot contain username");
            return;
        }else if(!password.equals(confirmedPassword)){
            System.out.println("Passwords do not match");
            return;
        }
        System.out.println("Username and password have been created");

    }
}
