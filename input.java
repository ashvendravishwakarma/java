public class input{
    static class Car{
        int price;
        String brand;
    }

    static class Rectangle{
        int length;
        int width;

        Rectangle(int l, int w){
            length =l;
            width=w;

        }

        void area(){
            System.out.println("area of the Rectengle :"+(length*width));
        }
    }

    public static void main(String[] args) {
        // Car c1 = new Car();
        // c1.price = 500000;
        // c1.brand = "BMW";
        // System.out.println(c1.price);
        // System.out.println(c1.brand);

        Rectangle r1=new Rectangle(10,5);
        r1.area();


    }
}