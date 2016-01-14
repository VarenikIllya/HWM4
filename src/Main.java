package HWM4.01;


public class Main {
    public static void main(String[] args) {
        Figure triangle = new Triangle(1,2,3);
        Figure circle = new Circle(12);
        Figure rectangle = new Rectangle(5);

        System.out.println("Triangle : " + triangle.calculateArea());
        System.out.println("Circle : " + circle.calculateArea());
        System.out.println("Rectangle : " + rectangle.calculateArea());
    }
}
