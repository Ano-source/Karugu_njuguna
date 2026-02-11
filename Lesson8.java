import java.util.Scanner;

public class Lesson8{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        // 1. Create the object(instance)from the Blueprint
        BankAccount arnoldAccount = new BankAccount();

        // 2. Set the initial state
        arnoldAccount.balance = 50000.0;

        System.out.println("--- KENYA DIGITAL BANK: OOP VERSION ---");
        System.out.println("Starting Balance: KES"+ arnoldAccount.balance);

        // 3. Performe a transaction using the objects methods
        System.out.print("\nEnter amount to withdraw:");
        double amt = keyboard.nextDouble();

        // This calls the tool defined in BankAccount.java
        arnoldAccount.withdraw(amt);

        System.out.println("Final Balance: KES"+ arnoldAccount.balance);

        keyboard.close();
    }
}