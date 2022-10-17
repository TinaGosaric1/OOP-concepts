package mojaMapa.encapsulation;

public class Account {
    private String number;
    private double balance;
    private String costumerName;
    private static int numberOfAccounts=0; //count the number of objects (accounts) created

    public Account() {
        this("name undefined", "000", 0.0); //calling another constructor to set default values
    }

    public Account(String costumerName, String number, double balance) { //constructor
        this.number = number;
        this.balance = balance;
        this.costumerName = costumerName;
        numberOfAccounts++;
    }

    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount +" made. New balance is " + this.balance);
    }

    public void withdrawal(double withdrawalAmount){
        if(this.balance - withdrawalAmount < 0){
            System.out.println("Only " + balance + " available. Withdrawal not processed.");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCostumerName() {
        return costumerName;
    }

    public void setCostumerName(String costumerName) {
        this.costumerName = costumerName;
    }
}
