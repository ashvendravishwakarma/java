import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                // BankAccount b1 = new BankAccount("Rohan", 20000, "ROHAN!!!");
        BankAccount b1 = new BankAccount("ROHAN", 30000, "Rohan");
     
        // b1.displayHistory();
        // b1.displayWelcome();

        while (true) {
            System.out.println(
                    "===== ATM MENU =====\n1. Check Balance\n2. Deposit Money\n3. WithdrawMoney\n4.Account Holder\n5. chack interest\n6. chnge pin\n7. display History \n8. Exit\nEnter your choice:");
            String choice = sc.next();

            switch (choice) {
                case "1":
                    b1.checkBalance();
                    break;

                case "2":
                    System.out.print("Enter Deposit amount : ");
                    int dep = sc.nextInt();

                    System.out.print("Enter PIN : ");
                    String enterpin = sc.next();

                    b1.deposit(dep, enterpin);
                    break;

                case "3":
                    System.out.print("Enter withdraw  amount : ");
                    int w = sc.nextInt();

                    System.out.print("Enter PIN : ");
                    String enterpin1 = sc.next();

                    b1.withdraw(w, enterpin1);
                    break;

                case "4":
                    b1.displayAccountHolder();
                    break;

                case "5":
                    b1.calculateInterest();
                    break;

                case "6":
                    System.out.print("Enter current pin : ");
                    String currentPin = sc.next();

                    System.out.print("New pin  : ");
                    String newPin = sc.next();

                    b1.changePin(currentPin, newPin);
                    break;

                case "7":
                    b1.displayHistory();
                    break;

                case "8":
                    return;

                default:
                    System.out.println("Invalid choice !!!!!!!");
                    break;

            }
        }
    }
}

class BankAccount {
    private String accountHolder;
    private double balance;
    private String pin;
    private int dailyWithdrawalLimit = 10000;
    private int totalWithdrawnToday = 0;
    private int wrongPinAttempts = 0;
    private boolean isLocked = false;

    BankAccount(String accountHolder, double balance, String pin) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.pin = pin;
    }

    String[] transaction = new String[100];
    int transactionCount = 0;

    void displayHistory() {
        if (transactionCount == 0) {
            System.out.println("No transactions yet");
            return;
        }

        System.out.println("===== TRANSACTION HISTORY =====");

        for (int i = 0; i < transactionCount; i++) {
            System.out.println((i + 1) + ". " + transaction[i]);
        }
    }

    void changePin(String currentPin, String newPin) {

        if (!verifyPin(currentPin)) {
            return;
        }

        if (newPin.length() < 4) {
            System.out.println("PIN must contain at least 4 characters!");
            return;
        }

        pin = newPin;

        System.out.println("PIN changed successfully!");
    }

    boolean verifyPin(String enterPin) {

        if (isLocked) {
            System.out.println("Account is locked!");
            return false;
        }

        if (enterPin.equals(pin)) {
            return true;
        } else {
            wrongPinAttempts++;

            System.out.println("Wrong PIN!");

            if (wrongPinAttempts >= 3) {
                isLocked = true;
                System.out.println("Account locked after 3 wrong attempts!");
            } else {
                System.out.println("Attempts remaining: "
                        + (3 - wrongPinAttempts));
            }

            return false;
        }
    }

    double getBalance() {
        return balance;
    }

    void deposit(int amount, String enterPin) {

        if (!verifyPin(enterPin)) {
            return;
        }

        if (amount <= 0) {
            System.out.println("Invalid amount!");
            return;
        }

        if (transactionCount >= transaction.length) {
            System.out.println("Transaction history is full!");
            return;
        }

        balance += amount;
        transaction[transactionCount] = "Deposit: " + amount;
        transactionCount++;

        System.out.println("Deposit successful!");
    }

    void withdraw(int amount, String enterPin) {

        if (!verifyPin(enterPin)) {
            return;
        }

        if (amount <= 0) {
            System.out.println("Invalid amount!");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient balance!");
            return;
        }

        if (totalWithdrawnToday + amount > dailyWithdrawalLimit) {
            System.out.println("Daily withdrawal limit exceeded!");
            return;
        }

        if (transactionCount >= transaction.length) {
            System.out.println("Transaction history is full!");
            return;
        }

        balance -= amount;
        totalWithdrawnToday += amount;

        transaction[transactionCount] = "Withdraw: " + amount;
        transactionCount++;

        System.out.println("Withdrawal successful!");
    }

    void displayAccountHolder() {
        System.out.println("Account Holder: " + accountHolder);
    }

    void displayWelcome() {
        System.out.println("Welcome to Savings Account");
    }

    void calculateInterest() {
        System.out.println("YOUR !1 year intrest : " + ((balance * 4) / 100));
    }
    double checkBalance(){
        return balance;

    }

}

class SavingAccount extends BankAccount {

    SavingAccount(String name, double balance, String pin) {
        super(name, balance, pin);
    }

    void showBalane() {
        checkBalance();

    }

    @Override
    void displayWelcome() {
        System.out.println("Welcome to Savings Account");
    }

    @Override
    void calculateInterest() {

        System.out.println("YOUR !1 year intrest : " + ((super.getBalance() * 4) / 100));
    }
}