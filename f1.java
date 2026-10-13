
public class f1 {
    
    public static void main(String[] args) {
        Book b1 = new Book("Rich Dad Poor Ded",450);
        System.out.println(b1.title + "    "+ b1.price);

        car c1 = new car();

        System.out.println(c1.brand);
        
        }   
        
class Studen{
    String name;
    int roll_nom;
}

static class Book{
    String title;
    int price;

    Book(String title ,int price){
        this.title=title;
        this.price=price;
    }
}
static class car{
    String brand;

    car(){
        brand="Unknown";
    }
}
}
