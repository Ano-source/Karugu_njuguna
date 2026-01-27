import java.util.Scanner;

public class Lesson5{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        // Variables for Lesson 4 (Security)
        int correctPin = 1234;
        int enteredPin;
        int attempts = 0;

        // Variables for Lesson 4 (Fintech Logic)
        double balance = 50000.0; // Starting amount
        int choice; // Menu selection
        
        System.out.println("--- WELCOME TO KENYA DIGITAL BANK ---");

        // SECURITY LOOP(lESSON4)
        while(attempts<3){
            System.out.print("Enter your PIN");
            enteredPin = keyboard.nextInt();

            if(enteredPin == correctPin){
                System.out.println("Access Granted! Welcome Arnold.");

                // TRANSACTION MENU(Lesson 5)
                System.out.println("1. Chack Balance");
                System.out.println("2. Withdraw Cash");
                System.out.println("3. Exit");
                choice = keyboard.nextInt();

                if(choice == 1){
                    System.out.println("Current Balance: KES"+balance);
                }else if(choice == 2){
                    System.out.print("Enter amount to withdraw:");
                    double amount = keyboard.nextDouble();

                    if(amount <= balance){
                        balance -= amount;// Subtracting from state
                        System.out.println("Withdrawal succesful. New balance: KES"+ balance);
                    }else{
                        System.out.println("Error: Insufficient Funds");
                    }
                }else{
                    System.out.println("Thank you for banking with us");
                }

                break;// Exit the PIN loop once access is granted

            }else{
                attempts++;
                int remaining = 3 - attempts;
                System.out.println("Wrong PIN. Tries remaining:"+ remaining);
            }
        }

        if(attempts == 3){
            System.out.println("Too many failed attempts. Account Locked.");
        }


        keyboard.close();
    }
}