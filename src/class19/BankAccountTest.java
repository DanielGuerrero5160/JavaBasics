package class19;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount ba=new BankAccount();//object of the parent class
        ba.accountNumber=398454385;
        ba.money=1000;
        ba.deposit();
        System.out.println(ba.accountNumber);
        System.out.println(ba.money);
        System.out.println("_______Creating an object of checking acct");


        //ba.transfer(); not possible as this method is only defined inside sub/child class
//not available to parent class
       Checking check=new Checking();//object of sub-class
       check.accountNumber=5765;
       check.money=780;
       check.interest=0;
       check.deposit();//can access method from parent class
       check.transfer();//can access method from its own class which is sub-class

        System.out.println("______creating an objects of savings acct");
        Savings save=new Savings();
        save.accountNumber=345978345;
        save.money=43724;
        save.profit=100;
        //save.interest=0; Not accessible as interest is of the checking account sub-class
        //sibling features are not available
        save.deposit();//from parent class
        save.takeProfit();//method from savings subclass
        //save.transfer(); not available as transfer is from sibling savings class

        SuperSavings sSave=new SuperSavings();
        sSave.accountNumber=3423;
        sSave.money=123456;
        sSave.deposit();
        sSave.takeProfit();
        sSave.profit=100000;
        sSave.superSavings();
    }

}
