
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product price: ");
        double price = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        double totalCost = price * quantity;

        System.out.println("Total Cost: " + totalCost);

// ______________________________________________________________________

        System.out.print("Enter basic salary: ");
        double basicSalary = sc.nextDouble();

        double hra = basicSalary * 0.80;
        double da = basicSalary * 0.10;

        double grossSalary = basicSalary + hra + da;

        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + grossSalary);

// ___________________________________________________________________________
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        sc.close();
    }
}
