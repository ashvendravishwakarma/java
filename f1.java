public class f1{
    static class Student{
        String name;
        int age;
        double marks;

        Student(String name , int age , double marks ){
            this.name=name;
            this.age=age;
            this.marks=marks;
        }
        void displayDetail(){
            System.out.println("Name :"+this.name);
            System.out.println("age :"+this.age);
            System.out.println("Marks :" + this.marks);
        }
    }
    public static void main(String[] args) {
        Student s1= new Student("Rahul",19,85.5);
        s1.displayDetail();

        Student s2= new Student("Aman",20,91.0);
        s2.displayDetail();

        Student s3= new Student("Priya",18,78.5);
        s3.displayDetail();
    }
}