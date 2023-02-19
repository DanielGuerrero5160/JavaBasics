package class27;

public class Demo2 {

    public static boolean checkForName(String[] names, String name) {

        for (String x : names) {
            if (x.equals(name)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String[] names={"Hiral", "Nima","Laura","Nat"};
        String name="Nima";
        //create a method which can search a name from this array

        System.out.println(checkForName(names,name));
    }
}
