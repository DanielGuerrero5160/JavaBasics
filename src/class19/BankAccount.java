package class19;

public class BankAccount {//parent class/super class/base class
    long accountNumber;
    double money;

    void deposit() {
        System.out.println("Deposit method from BenkAccount class");
    }
}
    class Checking extends BankAccount{//child class/sub-class/derived class

        double interest;
       void transfer(){
           System.out.println("Transfer method from Checking class");
       }

       }
class Savings extends BankAccount{
    double profit;

    void takeProfit(){
        System.out.println("Profit method from savings class");
    }
    }
    class SuperSavings extends Savings{
    void superSavings(){
        System.out.println("Super Saving method from the super Saving class");
    }


    }

