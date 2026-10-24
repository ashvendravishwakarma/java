public class abs {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        circle.calculatearea();
        rectangle.calculatearea();

    }
}

abstract class Shape {
    abstract void calculatearea();
}

class Circle extends Shape {
    void calculatearea() {
        int redius = 500;
        System.out.println("Circle Area : " + (3.14 * redius * redius));
    }

}

class Rectangle extends Shape {
    void calculatearea() {
        double length = 4.88;
        int width = 6;
        System.out.println("Rectangle  Area : " + (length * width));
    }

}
