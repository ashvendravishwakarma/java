public class ankit{
    public static void main(String [] args){

    }
}

class Employee{
    String name;
    double basicSalary;

    Employee(String n , double b){
        name=n;
        basicSalary=b;

    }

    public void displayDetails(){
        System.out.println("NAME :"+ name );
        System.out.println("SALARY ;" + basicSalary);

    }
class Manager extends Employee {
    int bonus;

    Manager(String name, int salary, int bonus) {
    super(name, salary);
        this.bonus = bonus;
    }
}
}

