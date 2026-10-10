import java.util.Scanner;
public class first {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int pin =sc.nextInt();
        int c_pin =2468;

        if (pin == c_pin){
            System.out.println("Access Granted");
        }else{
            System.out.println("Access Denied");
        }

        // System.out.println("Enter the guess number :");
        // int sec_num=sc.nextInt();
        
        // int number=9;
        // if (sec_num == number){
        //     System.out.println("Correct Guess");
        // }else if (sec_num > number){
        //     System.out.println("Too high");
        // }else if(sec_num < number ){
        //     System.out.println("TOO low");
        // }else{
        //     System.out.println("Invalid number");
        // }

    //     String pass=sc.nextLine();

    //     int len=pass.length();

    //     if (len>-1 && len <5){
    //         System.out.println("Very week passward"); 
    //     }else if(len>4 && len <8){
    //         System.out.println(" week passward"); 
    // }else if(len>7 && len <12){
    //         System.out.println("Good  passward"); 
    // }else if(len>11){
    //         System.out.println("Strong passward"); 
    // }else{
    //     System.out.println("Invalid input");
    // }
        // System.out.print("Enter username : ");
        // String U_name=sc.nextLine();
        // System.out.print("Enter id passward : ");
        // String pass=sc.nextLine();

        // String username="rohan_rai";
        // String passward="roahn123123";


        // if (U_name.equals(username)){
        //     if (pass.equals(passward)) {
        //         System.out.println("Login Successfully");
                
        //     }else{
        //         System.out.println("Invalid passward !please try again");
        //     }
        // }else{
        //     System.out.println("Invalid User name Try again");
        // }
        // int marks =sc.nextInt();
        // if ((marks>=0) && (marks <=100)){
        //     if(marks >=90){
        //         System.out.println("Grage A");
        //     }else if (  marks >= 75 && marks<=89){
        //         System.out.println("Grage B");

        //     }else if (  marks >= 60 && marks<=74){
        //         System.out.println("Grage C");

        //     }else if (  marks >= 40 && marks<=59){
        //         System.out.println("Grage D");

        //     }else {
        //         System.out.println("Fail");

        //     }

        // }else{
        //   System.out.println("Invalid input marks");
        // }
        // int bill =0;
        // System.out.println("Total Unit :" +e_unit);
        // if( e_unit>=0 && e_unit<=100){
        //     bill= e_unit * 5;
        //     System.out.println("Bill :" + bill + " ruppes");
        // }else if(e_unit>=101 && e_unit<=200 ){
            
        //     int n=e_unit-100;
        //     bill=(n*7) +500;
        //     System.out.println("Bill :" + bill +" rupees");
        // }else if( e_unit >200){
        //      int n=e_unit-200;
        //      bill =(n*10) +1200;
            
        //     System.out.println("Bill :" + bill +" ruppes");
        // }else {
        //     System.out.println("Invalid Input");

        // }
        


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
