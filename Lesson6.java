import java.util.Scanner;

public class Lesson6{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        int correctPin = 1234;
        int enteredPin;
        int attempts = 0;
        double balance = 50000.0; // Our"State"
        int choice;

        System.out.println("--- WELCOME TO KENYA DIGITAL BANK ---");

        // SECURITY GATE(While Loop)
        while(attempts < 3){
            System.out.print("Enter your PIN:");
            enteredPin = keyboard.nextInt();

            if(enteredPin == correctPin){
                System.out.println("Access Granted! Welcome, Arnold");

                // PERSISTENT MENU(Do-While Loop)
                do{
                    System.out.println("1. Check Balance");
                    System.out.println("2. Withdraw Cash");
                    System.out.println("3. Deposit Cash");
                    System.out.println("4. Exit");
                    System.out.print("Select an Option:");
                    choice = keyboard.nextInt();

                    if(choice == 1){
                        System.out.println("Current Balance:KES"+ balance);
                    } else if(choice == 2){
                        System.out.print("Enter amount to withdraw:");
                        double amount = keyboard.nextDouble();
                        if(amount <= balance){
                            balance -= amount; // Subtracting from balance
                            System.out.println("Withdrawal successful. New balance: KES" + balance);
                        }else{
                            System.out.println("Error: Insufficient Funds.");
                        }
                    } else if(choice == 3){
                        System.out.print("Enter amount to deposit");
                        double deposit = keyboard.nextDouble();
                        balance += deposit;// Adding to balance

                        System.out.println("Deposit successful. New balance: KES"+ balance);
                    }
                } while(choice != 4);// Loop continues until user picks 4

                break; // Exit security loop once the session is done
            } else{
                attempts++;
                System.out.println("Wrong PIN. Tries remaining:"+ (3 - attempts));
            }
        }
        System.out.println("Thank you for banking with us. Goodbye");
        keyboard.close();
    }
}