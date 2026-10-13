
public class f1 {
    
    public static void main(String[] args) {
        Phone p1 = new Phone();
        Phone p2 = new Phone();
        Phone p3 = new Phone();

        p1.brand="Samsung";
        p1.price=30000;

        p2.brand="oppo";
        p2.price=50000;

        p3.brand="Apple";
        p3.price=100000;

        p1.show();
        p2.show();
        p3.show();
        
        }   
static class Phone{
    String brand;
    int price;

    void show(){
        System.out.println("Brand: "+brand);
        System.out.println("Price : "+price);
    }
}
}
