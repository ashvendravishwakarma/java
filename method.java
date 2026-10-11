public class method {
    static void welcome(){
        System.out.println("Welcome to java");
    }
    public static void myName(){
        System.out.println("My name is Ashvendra");
    }
    static void even(int num){
        if (num % 2== 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
    static int sum(int a, int b){
        int c =a+b;
        return c;
    }
    static int square(int n){
        int c=n*n;
        return c;
    }
    static int findmax(int a,int b){
        if (a>=b){
            return a;
        }else{
            return b;
        }
    }
    static int fect(int n){
        int fact=1;
        for (int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    static void isprime(int n){
        if (n % 2==0 || n % 3 ==0 || n%5==0){
            System.out.println("NOT PRIME");
        }else{
            System.out.println(" PRIME");   
        }
    }
    static int multiply(int a,int b){
        return a*b;
    }
    static int multiply(int a,int b,int c){
        return a*b*c;
    }
    public static void main(String [] args){
        welcome();
        myName();
        even(4);
        sum(3,5);
        System.out.println( sum(3,5));
        System.out.println(square(6));
        System.out.println(findmax(5,23));
        System.out.println(fect(5));
        isprime(4);

        int e=multiply(3,5);
        System.out.println(e);

        int f=multiply(6,5,4);
        System.out.println(f);
        
        
    }
    
}
