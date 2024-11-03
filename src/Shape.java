abstract class Shape {
    public abstract double calculateArea();
}
class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}
class Triangle extends Shape {
    private double base;
    private double height;
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public double calculateArea() {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Shape circle = new Circle(2.0);
        System.out.println("Area of Circle: " + circle.calculateArea());

        Shape rectangle = new Rectangle(2.0, 6.0);
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());

        Shape triangle = new Triangle(2.0, 6.0);
        System.out.println("Area of Triangle: " + triangle.calculateArea());
    }
}
