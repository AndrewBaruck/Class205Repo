package individuals_220;

public class CheckingAccount extends BankAccount{

    private int overdraftFee = 0;

    @Override
    public boolean debit(int pennies){
        balance = balance - pennies;

        if(balance < 0){
            balance = balance - overdraftFee;
        }
        return true;
    }
    public void applyInterest(){
        if(balance > 0){
            double addAmount =  balance * interestRate;
            balance = balance  + (int) addAmount;
        }
    }

    public int getFee() {
        return overdraftFee;
    }

    public void setFee(int overdraftFee) {
        this.overdraftFee = overdraftFee;
    }

    public String accountInfo(){
        return("Type of Account : Checking\n" + "Account ID      : " + accountID + "\n" + String.format("Current Balance : $%.2f", (float) balance/100.0) + String.format("\n" + "Interest rate   : %.2f", interestRate*100.0) +  "%\n" + String.format("Overdraft Fee   : $%.2f", (float) overdraftFee /100));
    }
}
