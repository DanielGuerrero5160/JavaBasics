package class4;

public class MortgageRateHw {
    public static void main(String[] args) {
        double mortgageRate=4.0;
        double mortgagePrice=42000.0;
        double loan=199999.0;
        if(mortgageRate>4.5){
            System.out.println("you will not buy a house");
        }else{
            System.out.println("you will consider buying a house");
        }
        if(mortgagePrice>200000){
            System.out.println("You will take a loan");
        }else{
            System.out.println("you will pay in cash");
        }
        if(loan<=200000){
            System.out.println("we will lend the money");
        }else{
            System.out.println("We will not lend the money and reject client");
        }
    }
}
