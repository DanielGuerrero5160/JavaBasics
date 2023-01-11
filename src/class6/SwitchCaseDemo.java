package class6;

public class SwitchCaseDemo {
    public static void main(String[] args) {

        String country="USA";
        System.out.println(country.toLowerCase());

        switch(country.toLowerCase()){//toLowerCase() allows us to write case statements in lower case
            case "usa":
                System.out.println("Hamburger");
                break;
            case "Iteal":
                System.out.println("Pasta");
                break;
            case "afganistan":
                System.out.println("Kebab");
                break;
            default:
                System.out.println("Wrong Country");
        }

    }
}
