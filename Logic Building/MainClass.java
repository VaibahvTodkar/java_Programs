// Circle class
class Circle {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double calculateArea() {
        return 3.14 * radius * radius;
    }
}

class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color); 
        this.height = height;
    }

   

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateVolume() {
        return calculateArea() * height;
    }
}

public class MainClass {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "blue");
        System.out.println("Circle:");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Color: " + circle.getColor());
        System.out.println("Area: " + circle.calculateArea());

        Cylinder cylinder = new Cylinder(10, "green", 10);
        System.out.println("Cylinder:");
        System.out.println("Radius: " + cylinder.getRadius());
        System.out.println("Color: " + cylinder.getColor());
        System.out.println("Height: " + cylinder.getHeight());
        System.out.println("Base Area: " + cylinder.calculateArea());
        System.out.println("Volume: " + cylinder.calculateVolume());
    }
}