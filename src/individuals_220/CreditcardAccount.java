package individuals_220;

public class CreditcardAccount extends BankAccount{

    private int limit = 0;

    public boolean debit (int pennies){
        if(balance + pennies <= limit){
            balance = balance - pennies;
            return true;
        }

        return false;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getLimit(){
        return limit;
    }

    public void applyInterest() {
        if (balance < 0) {
            double addAmount = balance * interestRate;
            balance = balance + (int) addAmount;
        }
    }
    public String accountInfo(){
            return("Type of Account : Creditcard\n" + "Account ID      : " + accountID + "\n" + String.format("Current Balance : $%.2f", (float) balance/-100.0) + String.format("\n" + "Interest rate   : %.2f", interestRate*100.0) +  "%\n" + String.format("Credit Limit    : $%.2f", (float) limit /100));
        }


}
