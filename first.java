import java.util.Scanner;
public class first {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number  :");
        int a =sc.nextInt();

        System.out.println("Enter Second Number :");
        int b=sc.nextInt();

        System.out.println("Enter Operator");
        System.out.println("+,-,*,/");
        char opr=sc.next().charAt(0);

        switch (opr) {
            case '+':
                System.out.println("Addition :"+(a+b));
                break;
            
            case '-':
                System.out.println("Subtraction :"+(a-b));
                break;

            case '*':
                System.out.println("multiplication  :"+(a*b));
                break;

            case '/':
                System.out.println("Division :"+(a/b));
                break;

            default:
                System.out.println("Invalid input ");
                break;
        }

    }
    
}
