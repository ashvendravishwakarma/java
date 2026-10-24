public class abstraction {
    public static void main(String[] args) {
        Animal d = new Dog();
        d.sount();
    }
    
}

abstract class Animal{
    abstract void sount();

}

class Dog extends  Animal{
    void sount(){
        System.out.println("dog barks");
    }
}
