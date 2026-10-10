import java.util.Scanner;
public class first {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter electricity unit  :");
        int e_unit =sc.nextInt();
        int bill =0;
        System.out.println("Total Unit :" +e_unit);
        if( e_unit>=0 && e_unit<=100){
            bill= e_unit * 5;
            System.out.println("Bill :" + bill + " ruppes");
        }else if(e_unit>=101 && e_unit<=200 ){
            
            int n=e_unit-100;
            bill=(n*7) +500;
            System.out.println("Bill :" + bill +" rupees");
        }else if( e_unit >200){
             int n=e_unit-200;
             bill =(n*10) +1200;
            
            System.out.println("Bill :" + bill +" ruppes");
        }else {
            System.out.println("Invalid Input");

        }
        


    }

        // System.out.println("Enter Second Number :");
    //     int b=sc.nextInt();

    //     System.out.println("Enter Operator");
    //     System.out.println("+,-,*,/");
    //     char opr=sc.next().charAt(0);

    //     switch (opr) {
    //         case '+':
    //             System.out.println("Addition :"+(a+b));
    //             break;
            
    //         case '-':
    //             System.out.println("Subtraction :"+(a-b));
    //             break;

    //         case '*':
    //             System.out.println("multiplication  :"+(a*b));
    //             break;

    //         case '/':
    //             if(b==0){
    //                 System.out.println("annot divide by zero");
    //             }else{
    //                 System.out.println("Division :"+(a/b));
    //             }
    //             break;
                

    //         default:
    //             System.out.println("Invalid input ");
    //             break;
    //     }

    // }
    
}
