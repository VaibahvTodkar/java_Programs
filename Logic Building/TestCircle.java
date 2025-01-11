class Circle {
    float radius;
    String color;
    public Circle(float radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    // public float getRadius() {
    //     return radius;
    // }
    // public void setRadius(float radius) {
    //     this.radius = radius;
    // }
    public void calculateArea() {
        System.out.println("Area : " + 3.14* radius * radius);
    }
    
}

class Cylinder {
    int height;
    int radius;
    public Cylinder(int height, int radius) {
        this.height = height;
        this.radius = radius;
    }
    // public int getHeight() {
    //     return height;
    // }
    // public void setHeight(int height) {
    //     this.height = height;
    // }
    // public int getRadius() {
    //     return radius;
    // }
    // public void setRadius(int radius) {
    //     this.radius = radius;
    // }
    
    public void displayvolume(){
        System.out.println("Volume : " + 3.14*radius*radius*height );
    }
    
}

public class TestCircle{
    public static void main(String[] args) {
        Circle c = new Circle(10, "Orange");
        c.calculateArea();

        Cylinder cd = new Cylinder(10, 10);
        cd.displayvolume();
    }
}