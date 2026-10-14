public class f1{
static class Rectangle{
    int length;
    int width;

    Rectangle(int l ,int w){
        length=l;
        width=w;
    }

    void area(){
        System.out.println("Area of Rectangle :"+(length*width));
    }
}
    public static void main(String[] args) {

        Rectangle r1= new Rectangle(12,4);
        Rectangle r2= new Rectangle(232,4);
        Rectangle r3= new Rectangle(10,45);
        Rectangle r4= new Rectangle(56,23);
        Rectangle r5= new Rectangle(2,4);
        Rectangle r6= new Rectangle(11,34);
        Rectangle r7= new Rectangle(22,4);
        Rectangle r8= new Rectangle(8,56);
        Rectangle r9= new Rectangle(45,9);

        r1.area();
        r2.area();
        r3.area();
        r4.area();
        r5.area();
        r6.area();
        r7.area();
        r8.area();
        r9.area();
        


        
    }
}