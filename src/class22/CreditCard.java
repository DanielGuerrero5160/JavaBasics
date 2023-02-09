package class22;

public class CreditCard {

    /*
    Create a class CreditCard and define variable balance and interest.
    Create an instance method that will calculate interest based on the given balance.
Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
Call the method by creating an object of each of the three classes.


     */
    double balance;
    double interest=.04;

    void calcInterest(double balance){
        System.out.println(balance*interest);

    }
}
 class Visa extends CreditCard{


}
class AX extends CreditCard{
@Override
    void calcInterest(double balance){
        double interest=.03;
        System.out.println(balance*interest);

    }
}

class CCTester{
    public static void main(String[] args) {
        CreditCard cc=new CreditCard();
        cc.calcInterest(60000);

        Visa visa=new Visa();
        visa.calcInterest(60000);
        AX ax=new AX();
        ax.calcInterest(60000);


    }
}
