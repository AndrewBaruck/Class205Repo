package individuals_220;

public abstract class BankAccount {

    protected String accountID = "0000-0000-0000-0000";
    protected double interestRate = 0.0;
    protected int balance = 0;

    public boolean credit(int a){
        balance = balance + a;
        return true;
    }

    public abstract boolean debit(int b);
    public abstract void applyInterest();
    public abstract String accountInfo();

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
