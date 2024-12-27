abstract class Vehicle {
    abstract void run();
    void display(){
        System.out.println("Vehicle class display()");
    }
}
public class AbstractBike extends Vehicle {
    void run(){
        System.out.println("Bike is running method of abstract class");
    }
    public static void main(String[] args) {
        Vehicle b = new AbstractBike();
        b.run();
        b.display();
    }
}
