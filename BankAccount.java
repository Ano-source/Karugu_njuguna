public class BankAccount{
    // State: The data stored in the object
    public double balance;

    // Behaviour: The withdraw tool
    public void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println("Success! Withdrew KES"+ amount);
        } else{
            System.out.println("Error: Insufficient funds for thid transaction.");
        }
    }

    // Behaviour: The deposit tool
    public void deposit(double amount){
        balance += amount;
        System.out.println("Success! Deposite KES"+ amount);
    }
}