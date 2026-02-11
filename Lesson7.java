import java.util.Scanner;
// 1. MAIN METHOD: The manager that calls the tools
public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    double balance = 50000.0;
    int choice;

    System.out.println("--- WELCOME TO KENYA DIGITAL BANK---");

    do{
        showMenu();// Calling our custom method
        System.out.print("Select an option:");
        choice = keyboard.nextInt();

        if(choice == 1){
            System.out.println("Current Balance: KES"+ balance);
        } else if(choice == 2){
            System.out.print("Enter amount to withdraw:");
            double amount = keyboard.nextDouble();
            balance = handleWithdraw(balance,amount);// Using the withdrawal tool
        } else if(choice == 3){
            System.out.print("Enter amount to deposit:");
            double deposit = keyboard.nextDouble();
            balance = handleDeposit(balance, deposit);// Using the deposit tool
        }
    } while(choice != 4);

    System.out.println("Thank you for using the system. Goodbye!");
    keyboard.close();
}

// --- OUR CUSTOM TOOLS(METHODS)----

// 2. THE MENU TOOL
public static void showMenu(){
    System.out.println("\n--- MAIN MENU ---");
    System.out.println("1. Check Balance");
    System.out.println("2. Withdraw Cash");
    System.out.println("3. Deposit Cash");
    System.out.println("4. Exit");
}

// 3. THE WITHDRAWAL TOOL
public static double handleWithdraw(double bal, double amt){
    if(amt <= bal){
        bal -= amt;
        System.out.println("Withdrawal succesful. New balance: KES"+ bal);
    } else{
        System.out.println("Error: Insufficient Funds.");
    }
    return bal;// Sends the updated back to main
}

// 4. THE DEPOSIT TOOL
public static double handleDeposit(double bal, double amt){
    bal += amt;
    System.out.println("Deposit succesful. New balance: KES" + bal);
    return bal; // Sends the updated balance back to main
}