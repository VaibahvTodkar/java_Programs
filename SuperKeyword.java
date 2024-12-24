class Vehicle{
    // String color = "Black";
    Vehicle(String c){
        System.out.println("Parent class constructor" + c);
    }
    void display(){
        // System.out.println("Vehicle color :"+color);
    }
}

class Car extends Vehicle{
    String color = "White";
    Car(){
        System.out.println("Child class constructor");
    }
    void display(){
        System.out.println("Car color :"+color);
        // System.out.println("Vehicle color :"+super.color);
        // super.display();
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Car c = new Car();
        c.display();
        
    }
}
