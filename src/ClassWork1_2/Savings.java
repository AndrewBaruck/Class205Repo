package ClassWork1_2;

public class Savings extends ClassWork {
    private String name;
    private int accountNumber;
    private double balance;

    public Savings(){
        super();
        name = "No_Name";
        accountNumber = 1112;
        balance = 0.0;
    }

    public Savings(String a, int b, double c){
        //super(a, b, c);
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

    public double getBalance() {
        return balance;
    }

    public String toString(){

        if (balance == 0.0){
            name = name + "GET A JOB! ";
        }
        return "\nname: " + name +
                "\nNumber: " + accountNumber +
                "\nBalance: " + balance;
    }
}
