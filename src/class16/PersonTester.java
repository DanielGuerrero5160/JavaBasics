package class16;



public class PersonTester {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);
        System.out.println(person.address);
        //System.out.println(person.bankBalance); cannot access
        //bank balance because it is private access is Person class
        person.printSSN();
        person.printTikTokAcct();
        //person.printPhonePassword(); cannot use since method is private
    }
}
