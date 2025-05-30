package application.entities;

public class BankAccount {
    private int number;
    private String holder;
    private double balance;

    public BankAccount(String holder, int number){
        this.holder = holder;
        this.number = number;
    }

    public BankAccount(String holder, int number, double initialDeposit){
        this.holder = holder;
        this.number = number;
        deposit(initialDeposit);
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount + 5.0;
    }

    public String toString() {
        return "Account "
                + number
                + ", Holder: "
                + holder
                + ", Balance: $ "
                +String.format("%.2f", balance);
    }
}