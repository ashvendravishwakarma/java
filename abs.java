// public class abs {
//     public static void main(String[] args) {
//         Shape circle = new Circle(7);
//         Shape rectangle = new Rectangle(8,5);
//         System.out.println("Circle Area: " + circle.calculatearea());
//         System.out.println("Rectangle Area: " + rectangle.calculatearea());

//     }
// }

// abstract class Shape {
//     abstract double calculatearea();
// }

// class Circle extends Shape {
//     int radius;

//     Circle(int redius) {
//         this.radius = redius;
//     }

//     double calculatearea() {
//         return 3.14 * radius * radius;
//     }

// }

// class Rectangle extends Shape {
//     int length;
//     int width;

//     Rectangle(int length, int width) {
//         this.length = length;
//         this.width = width;
//     }

//     double calculatearea() {

//         return length * width;

//     }

// }

public class abs {
    public static void main(String[] args) {
        Developer d = new Developer(50000);
        Manager m = new Manager(80000);

        System.out.println("Developer Salary: " + d.getSalary());
        System.out.println("Developer Bonus: " + d.calculateBonus());

        System.out.println("Manager Salary: " + m.getSalary());
        System.out.println("Manager Bonus: " + m.calculateBonus());

    }
}

abstract class Employee {
    private double salary;

    Employee(double salary) {
        this.salary = salary;
    }

    public double  getSalary() {
        return salary;
    }

    abstract double calculateBonus();

}

class Developer extends Employee {
    

    Developer(double salary){
        super(salary);

    }
    @Override
    double calculateBonus() {
        return getSalary() * 10 / 100;
        // that is vary dificult i dont know about the cnstruction that is vary amaging 
    }
     

}

class Manager extends Employee {
    Manager(double salary){
        super(salary);

    }
    @Override
    double calculateBonus() {
        return getSalary() * 20 / 100;
    }

}
