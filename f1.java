public class f1{
    static class Employee{
        String name;
        int employeeId;
        double salary;

        Employee(String name ,int employeeId , double salary){
            this.name=name;
            this.employeeId=employeeId;
            this.salary=salary;
        }

        void increaseSalary(double amount){
            this.salary+=amount;
        }
        void displayDetails(){
            System.out.println("employee name :"+this.name);
            System.out.println("employee ID : "+ this.employeeId);
            System.out.println("Salary : "+this.salary);
        }
    }
    public static void main(String [] args){
        Employee e1 = new Employee("Rohan",1001,304000);
        e1.displayDetails();
        e1.increaseSalary(40000.0);
        e1.displayDetails();

    }
    

}