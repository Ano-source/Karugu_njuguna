public class BankAccount{
    private double balance;
    private String owner;

    public BankAccount(String name, double initialBalance){
        this.owner = name;
        this.balance = initialBalance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        if(amount <= balance) balance -= amount;
    }

    public double getBalance(){return balance;}
    public String getOwner(){return owner;}
}