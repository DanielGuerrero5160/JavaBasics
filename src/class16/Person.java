package class16;

public class Person {
    private double bankBalance=123345;//private designated variable should only be shared with this class
    String address="Street 123";//default access level is applied//can be used within package
   public String name="Jon Snow"; //public access level is applied//can be used in other packages if imported

   private void printPhonePassword(){//we want to make private because info needs to be secure
       System.out.println("pass123");
    }
     void printSSN(){
        System.out.println("1235245463");//default is used as we may want to share it with something outside the class
    }
   public void printTikTokAcct(){
       System.out.println("DannyG123");//we used public as this info can be known by others
    }
    public static void main(String[] args) {
        Person person=new Person();
        System.out.println(person.bankBalance);
        System.out.println(person.address);
        System.out.println(person.name);

    }

}
