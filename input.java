
public class input{
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2 =new Student();

        s1.name="ashvendra";
        s1.age=29;
        s1.rollnum=101;
        s1.collage="JNCT";

        s2.name="magan";
        s2.age=22;
        s2.rollnum=102;
        s2.collage="JNCT";

        s1.markAttendenc();
        s2.markAttendenc();

        s1.print();
        s2.print();

        }
    }
class Student{
    String name;
    int age;
    int rollnum;
    String collage;

    void markAttendenc(){
        System.out.println("Attendence marked by :"  + name);
    }

    void print(){
        System.out.println(name + " , "+ age + " , " + rollnum + " , "+collage);
    }
}
