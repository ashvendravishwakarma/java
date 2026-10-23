public class ankit{
    public static void main(String[] args) {
        Car c1 = new Car("Toyota",120, "Petrol");

        c1.displayVehicle();
        c1.displaycar();        
    }
}
class Vehical{
    String brand;
    int speed;

    Vehical(String brand , int speed){
        this.brand=brand;
        this.speed=speed;
    }

    public void displayVehicle(){
        System.out.println("Brand :" + this.brand);
        System.out.println("Speed : "+ this.speed);
    }


}
class Car extends Vehical{
    String fuelType;

    Car(String brand , int speed , String fuel){
        super(brand , speed);
        fuelType=fuel;
    }

    public void displaycar(){
        System.out.println("Brand :" + brand);
        System.out.println("Speed : "+ speed);
        System.out.println("Fuel : "+ fuelType);

    }
}