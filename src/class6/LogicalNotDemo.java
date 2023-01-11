package class6;

public class LogicalNotDemo {
    public static void main(String[] args) {

        System.out.println(false);
        System.out.println(!false);
        boolean condition=true;
        System.out.println(condition);

        String password="dlkfjgn";
        System.out.println(password.equals("pass123"));
        if (!password.equals("pass123")){
            System.out.println("Wrong password");

            boolean isRaining=true;

            if(!isRaining){
                System.out.println("Lets go for a walk");
            }else{
                System.out.println("Lets take an umbrella");
            }
        }
    }
}
