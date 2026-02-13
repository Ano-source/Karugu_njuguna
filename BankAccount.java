public class BankAccount{
    private double balance;
    private String owner;

    // THE CONSTRUCTOR: Runs automatically when you use 'new'
    public BankAccount(String name, double initialBalance){
        this.owner = name;
        if (initialBalance >= 0){
            this.balance =  initialBalance;
        }
    }

    // Safely see the money
    public double getBalance(){
        return balance;
    }

    // Professional withdrawal logic
    public void withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
        } else{
            System.out.println("Transaction failed for"+ owner);
        }
    }
}