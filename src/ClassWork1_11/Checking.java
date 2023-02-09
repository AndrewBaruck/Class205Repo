package ClassWork1_11;

public class Checking {
    private String name;
    private int accountNumber;
    private float balance;
    private Throwable oops = new Throwable("Below Zero");

    public Checking(){
        name = "Unknown";
        accountNumber = 1111;
        balance = 0;
    }

    public Checking(String a, int  b, float c){
        this.name = a;
        this.accountNumber = b;
        this.balance = c;
    }

    public String getName() {
        return name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public float getBalance() {
        return balance;
    }

    public String toString(){
        return "\nName: " + name +
                "\nAccount Num: " + accountNumber +
                "\nBalance" + balance;
    }

    public void withdrawl(float a) throws Throwable {

        balance = balance - a;

        if(balance < 0){
            throw oops;

        }


    }


}
