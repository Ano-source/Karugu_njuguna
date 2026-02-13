public class Lesson10{
    public static void main(String[] args){
        // One line to create AND initialize
        BankAccount arnoldAccount = new BankAccount("Arnold", 50000.0);
        BankAccount mickeyAccount = new BankAccount("Mickey", 30000);

        System.out.println("Account 1:"+ arnoldAccount.getBalance());
        System.out.println("Account 2:"+ mickeyAccount.getBalance());

        arnoldAccount.withdraw(5000);
    }
}