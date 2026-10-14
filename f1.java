public class f1{
    // static class Student{
    //     String name;
    //     int age;
    //     double marks;

    //     Student(String name , int age , double marks ){
    //         this.name=name;
    //         this.age=age;
    //         this.marks=marks;
    //     }
    //     void displayDetail(){
    //         System.out.println("Name :"+this.name);
    //         System.out.println("age :"+this.age);
    //         System.out.println("Marks :" + this.marks);
    //     }

    static class BankAccount{
        String accountHolder;
        int acountNumber;
        int balance;

        BankAccount(String accountHolder, int acountNumber ,int balance){
            this.accountHolder=accountHolder;
            this.acountNumber=acountNumber;
            this.balance=balance;
        }

        void deposit( double deposit_amount){
            this.balance += deposit_amount;
                      
        }

        void  withdraw(double amount){
            this.balance-=amount;
        }
        void DisplayDetail(){
            System.out.println("Name of acountholder : "+ this.accountHolder );
            System.out.println("Acount Number :"+this.acountNumber);
            System.out.println();
        }

    }
    
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Rohan", 10011, 20000000);
        b1.deposit(45.0);
        b1.withdraw(569986);
        b1.DisplayDetail();
    }
}