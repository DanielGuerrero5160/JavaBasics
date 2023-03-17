package class34;

public class LowBalanceExceptionTester {
    public static void main(String[] args) {
        transferBalance(1000,10000);

    }
   static void transferBalance(double acctBalance,double amountToTransfer){
        if(amountToTransfer>acctBalance){
            /*
            Throw keyword is used to throw the object of an exception class
             */
            throw new LowBalanceException("Insufficient funds for transfer");
        }

    }
}
