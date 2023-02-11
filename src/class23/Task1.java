package class23;

public class Task1 {
/*
Create a class CreditCard and define variable balance and interest.
Create an instance method that will calculate interest based on the given balance.
    //Create 2 subclasses: Visa and AX.
    In AX class override method calculate interest.
    //Call the method by creating an object of each of the three classes.
 */
public static void main(String[] args) {
    CreditCard cc=new CreditCard(100,10);
    cc.calcInt();
    Visa vs=new Visa(100,9);
    vs.calcInt();
    AX ax=new AX(100,8);
    ax.calcInt();
}
}
class CreditCard{
    double balance;
    double interest;

    public CreditCard(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }


    public void calcInt(){
        System.out.println("Interest "+(balance*interest)/100);
    }
}
class Visa extends CreditCard{

    public Visa(double balance, double interest) {
        super(balance, interest);
    }
}
class AX extends CreditCard{
    public AX(double balance, double interest) {
        super(balance, interest);
    }
@Override
    public void calcInt(){
        System.out.println("AX Interest "+(balance*interest)/100+30);
    }
}
