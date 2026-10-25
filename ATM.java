import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // BankAccount b1 = new BankAccount("Rohan", 20000, "ROHAN!!!");
        BankAccount b1 = new BankAccount("Rohan", 20000, "ROHAN!!!");
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
                    System.out.print("Enter Deposit amount : ");
                    int w = sc.nextInt();
                    System.out.print("Enter PIN : ");
                    String enterpin1 = sc.next();
                    b1.withdraw(w, enterpin1);
                    // withdraw money
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

    double getBalance() {
        return balance;
    }

    void deposit(int amount, String enterPin) {
        if (enterPin.equals(pin)) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Amount deposist Successfully!!!");
                transaction[transactionCount] = "Deposit : " + amount;
                transactionCount++;
            } else {
                System.out.println("invalid amount");
            }
        } else {
            System.out.println("wrong passward !!");
        }

    }

    void withdraw(int amount, String enterPin) {
        if (enterPin.equals(pin)) {
            if (amount <= 0) {

                System.out.println("Invalid Amount!!");
            } else {
                if (amount > balance) {
                    System.out.println("Insufficient balance !!");
                } else {
                    balance -= amount;
                    transaction[transactionCount] = "withdraw : " + amount;
                    transactionCount++;
                    System.out.println("withdraw successfully.......");
                }

            }
        } else {
            System.out.println("Invlid PIN !!");
        }
    }

    void checkBalance() {
        System.out.println("Your balance : " + balance);
    }

    void changePin(String currentpin, String newPin) {
        if (currentpin.equals(pin)) {
            pin = newPin;
            System.out.println("Update pin succesfully.....");

        } else {
            System.out.println("Invalid Pin");
        }
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