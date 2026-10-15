class ankit  {
static class Student{
    String name ;
    int  rollum;
    int mark1;
    int mark2;
    int mark3;

    Student(String name ,int  rollum,int mark1,   int mark2, int mark3){
        this.name=name;
        this.rollum=rollum;
        this.mark1=mark1;
        this.mark2=mark2;
        this.mark3=mark3;
        calculatePercentage();
        calculateTotal();
    }
    int calculateTotal(){
        int total=this.mark1+this.mark2+this.mark3;
        return total;
    }
    double calculatePercentage() {
        int total=calculateTotal();
        
        double parcent=((total)/300.0)*100;
        return parcent;
    }

    pass(){
 
        if (parcent >=32){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
    }
    void display(){
        int total=calculateTotal();
        double parcent =calculatePercentage();
        System.out.println("name : "+this.name);
        System.out.println("roll number : "+this.rollum);
        System.out.println("Total marks : " +total);
        System.out.println("parcentage of student : "+parcent);
    }
    
}
    public static void main(String[]args){

        Student rohan = new Student("Rohan",101,89,57,89);
        rohan.display();

        Student ankit = new Student("Ankit",102,89,78,89);
        ankit.display();

        Student ashvendra = new Student("Ashvendra",103,98,78,85);
        ashvendra.display();
        




    }
}