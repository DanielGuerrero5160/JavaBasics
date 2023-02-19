package class26;

public class Account {
  private  double balance;
   private String accountNumber;
   private String type;
   private String accountTitle;

   public void setAccountNumber(String accountNumber){
       if(accountNumber.length()!=14){
           System.out.println("Wrong account number");
       }else {
           this.accountNumber = accountNumber;
       }
   }
   public String getAccountNumber(){
       return accountNumber;
   }

   public void setBalance(double balance){
       //sanitizing the input meaning checking the values before we assign the,
       if(balance<0){
           System.out.println("Negative balance is not allowed, its a current account");
       }else {
           this.balance = this.balance+balance;
       }
   }
   public String getAccountTitle(){
       return accountTitle;
   }

    void depositFunds(double balance){
        this.balance=this.balance+balance;
    }
    void withdraw(double balance){
        if(balance<this.balance){
            this.balance=this.balance-balance;
        }
    }

    public Account(double balance, String accountNumber, String type, String accountTitle) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.type = type;
        this.accountTitle = accountTitle;
    }
}
class AccountTester{
    public static void main(String[] args) {

Account account=new Account(-1000,"shdfjgbsdjg","sdjgnskdf","sjdgnlsdg");
account.setBalance(1000000);

    }
}
