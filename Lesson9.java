public class Lesson9 {
    public static void main(String[] args){
        BankAccount arnoldAccount = new BankAccount();

        //This would now FAIL: arnoldAccount.balance = 50000;

        //Use the secure "Setter"instead
        arnoldAccount.setintialBalance(50000);

        //Use the "Getter" to see the money
        System.out.println("Secure Balance: KES"+ arnoldAccount.getBalance());

        arnoldAccount.withdraw(10000.0);
        System.out.println("New Balance: KES"+ arnoldAccount.getBalance());
    }
}
