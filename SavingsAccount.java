public class SavingsAccount extends BankAccount{
    private double interestRate = 0.05; // 5% interest

    public SavingsAccount(String name, double balance){
        super(name, balance); // Passes data to the Parent constructor
    }

    public void addinterest(){
        double interest = getBalance()* interestRate;
        deposit(interest); // Uses the method from the Parent
        System.out.println("interest added for"+ getOwner()+ ":KES"+ interest);
    }
}