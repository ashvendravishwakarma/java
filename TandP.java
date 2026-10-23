import java.util.Scanner;

public class TandP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // // 1. byte
        // byte k = 100;
        // System.out.println("byte: " + k);

        // // 2. short
        // short l = 20000;
        // System.out.println("short: " + l);

        // // 3. int
        // int m = 500000;
        // System.out.println("int: " + m);

        // // 4. long
        // long d = 9000000000L;
        // System.out.println("long: " + d);

        // // 5. float
        // float e = 12.5f;
        // System.out.println("float: " + e);

        // // 6. double
        // double f = 123.456789;
        // System.out.println("double: " + f);

        // // 7. char
        // char g = 'A';
        // System.out.println("char: " + g);

        // // 8. boolean
        // boolean h = true;
        // System.out.println("boolean: " + h);
        // int i = 5;
        // System.out.println("enter first number : " + i);
        // int r = 6;
        // System.out.println("enter first number : " + r);

        // System.out.println("enter second number");

        // int length = 45;
        // int width = 12;

        // int area = length * width;

        // System.out.println("Area of rectangle : " + area);

        // int quantity = 5;
        // int price = 40;
        // System.out.println("Total price of product : " + (quantity * price));

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }

        System.out.print("Enter three sides: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > 0 && b > 0 && c > 0 &&
            a + b > c && a + c > b && b + c > a) {
            System.out.println("Valid triangle");
        } else {
            System.out.println("Invalid triangle");
        }

        sc.close();

    }

}
