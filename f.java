public class f{
    public static void main(String[] args) {
        BankAcount b1 = new BankAcount();
        b1.deposit(5000);
        b1.withdraw(1500); 
        b1.getbalance();
        
    }
}

class BankAcount{
    private double balance;

    public void deposit(double amount){
        if (amount>0){
            balance += amount;
            System.out.println("Deposit successfully !!!!!!");
        }else{
            System.out.println("enter valid balance");
        }
       
    }

    public void  withdraw(double amount){
        if (amount>0 && balance>=amount){
            balance-=amount;
            System.out.println("Withdraw Successfully !!!!!");
        }else{
            System.out.println("not enoght money in your account ");
        }

    }

    public void getbalance(){
        System.out.println("your balance  : "+ balance);;

    }
    
    
}