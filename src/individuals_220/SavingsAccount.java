package individuals_220;

public class SavingsAccount extends BankAccount {


    @Override
    public boolean debit(int pennies) {
       if(pennies > balance){
           return false;
       }

       balance = balance - pennies;
       return true;
    }

    public void applyInterest(){
        if(balance > 0){
            double addAmount =  balance * interestRate;
            balance = balance  + (int) addAmount;
        }
    }

    public String accountInfo(){
        return("Type of Account : Savings\n" + "Account ID      : " + accountID + "\n" + String.format("Current Balance : $%.2f", (float) balance/100.0) + String.format("\n" + "Interest rate   : %.2f", interestRate*100.0) +  "%");
    }
}
