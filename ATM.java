import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SavingAccount b1 = new SavingAccount("Rohan", 20000, "ROHAN!!!");
        b1.checkBalance();

        b1.showAccountType();
        b1.showAccountType();

        // while (true) {
        // System.out.println(
        // "===== ATM MENU =====\n1. Check Balance\n2. Deposit Money\n3. Withdraw
        // Money\n4. Exit\nEnter your choice:");
        // System.out.println("Enter your choice : ");
        // String choice = sc.next();

        // switch (choice) {
        // case "1":
        // b1.checkBalance();
        // break;
        // case "2":
        // System.out.print("Enter Deposit amount : ");
        // int dep = sc.nextInt();
        // System.out.print("Enter PIN : ");
        // String enterpin = sc.next();
        // b1.deposit(dep, enterpin);

        // break;
        // case "3":
        // System.out.print("Enter Deposit amount : ");
        // int w = sc.nextInt();
        // System.out.print("Enter PIN : ");
        // String enterpin1 = sc.next();
        // b1.withdraw(w, enterpin1);
        // // withdraw money
        // break;
        // case "4":

        // break;

        // default:
        // System.out.println("Invalid choice !!!!!!!");
        // break;

        // }
        // }
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

    void deposit(int amount, String enterPin) {
        if (enterPin.equals(pin)) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Amount deposist Successfully!!!");
            } else {
                System.out.println("invalid amount");
            }
        } else {
            System.out.println("wrong passward !!");
        }

    }

    void withdraw(int amount, String enterPin) {
        if (enterPin.equals(pin)) {
            if ((amount > 0) && (balance >= amount)) {
                balance -= amount;
                System.out.println("Amount withdraw Successfully!!!");
            } else {
                System.out.println("Insufficient balance");
            }
        } else {
            System.out.println("Invlid PIN !!");
        }
    }

    void checkBalance() {
        System.out.println("Your balance : " + balance);
    }

    void showAccountType() {
        System.out.println("General Bank Account");
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
    void showAccountType() {
        System.out.println("Savings Account !!!");
    }
}