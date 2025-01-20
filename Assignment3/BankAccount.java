public class BankAccount {

    int accountNumber;
    String accountHolder;
    double balance;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " now your New Balance is: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " now your New Balance is: " + balance);
        } else {
            System.out.println("Dont have sufficient Balance!!!");
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance is: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(250);
        account.withdraw(450);
        account.checkBalance();

        account.accountNumber = 12345;
        account.accountHolder = "Karanveer Mehra";
        account.balance = 1250.0;

    }
}
