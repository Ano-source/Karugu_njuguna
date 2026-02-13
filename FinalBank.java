import java.util.ArrayList; // The Lesson 12 Tool

public class FinalBank{
    public static void main(String[] args){
        // Create a List to hold all accounts
        ArrayList<BankAccount> tttiBank = new ArrayList<>();

        // Add different types of accounts to the SAME list
        tttiBank.add(new BankAccount("Arnold", 50000));
        tttiBank.add(new BankAccount("Mickey", 30000));

        System.out.println("--- TTTI CENTRAL BANK DATABASE ---");

        // Loop through the database
        for (BankAccount account : tttiBank){
            System.out.println("Customer:"+ account.getOwner()+" | Balance: KES"+ account.getBalance());

            // if it`s a saving account, give them interest!
            if(account instanceof SavingsAccount){
                ((SavingsAccount)account).addinterest();
            }
        }
    }
}