package class4;

public class IfDemo1 {
    public static void main(String[] args) {
        int money = 15000;

        if (money > 1000) {
            System.out.println("Lets buy and iphone");
        }
        if (money > 2000) {
            System.out.println("Lets also buy a macbook");
        }
        boolean mothersDay = true;

        if (mothersDay) {
            System.out.println("Happy Mothersday!");
        }

        String name = "Sardar";
///equals method is only used for non-primitive data types.
        if (name.equals("Sardar")) {
            System.out.println("I love football");
        }
    }
}
