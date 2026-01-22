import java.util.Scanner; // 1. The Import (Toolbox)

public class Lesson4 {
    public static void main(String[] args) {
        // 2. The "Boring" Setup
        Scanner keyboard = new Scanner(System.in); 
        int correctPin = 1234;
        int attempts = 0;

        System.out.println("--- WELCOME TO KENYA DIGITAL BANK ---");

        // 3. The Automation (Loop)
        while (attempts < 3) {
            System.out.print("Enter your PIN: ");
            
            // The program stops here and waits for you to type + hit Enter
            int enteredPin = keyboard.nextInt(); 

            if (enteredPin == correctPin) {
                System.out.println("Access Granted! Welcome, Arnold.");
                break; // Emergency exit from the loop
            } else {
                attempts++;
                int remaining = 3 - attempts;
                System.out.println("Wrong PIN. Tries remaining: " + remaining);
            }
        }

        // 4. The Final Feedback
        if (attempts == 3) {
            System.out.println("Too many failed attempts. Account Locked.");
        }
        
        keyboard.close(); // Closing the listener
    }
}