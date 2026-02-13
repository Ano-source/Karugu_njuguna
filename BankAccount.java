public class BankAccount{
    // 1.Private means 'Lesson9' cannot touch this directly
    private double balance;

    // 2. The 'Setter' to initialize the money
    public void setintialBalance(double amount){
        this.balance = amount;
    }

    // 3. The 'Getter' so Lesson9 can see the money 
    public double getBalance(){
        return balance;
    }

    // 4. The secure withdrawal gate
    public void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println("Success! Withdrew: KES"+ amount);
        } else{
            System.out.println("Insufficient funds!");
        }
    }
}