class Vehicle {  
    private String make;  
    private String model;  
    private int year;  
    // Constructor with all parameters  
    public Vehicle(String make, String model, int year) {  
        this.make = make;  
        this.model = model;  
        this.year = year;  
    }  
    // Constructor that defaults the year  
   public Vehicle(String make, String model) {  
        this(make, model, 2020);  // Chaining to the main constructor  
    }  
    // Default constructor  
    public Vehicle() {  
        this("Unknown", "Unknown");  // Chaining to the main constructor  
    }  
    //Method to display vehicle details  
    public void displayInfo() {  
        System.out.println("Vehicle: " + make + " " + model + " (" + year + ")");
    }
}




public class ConstructorChaining {
    public static void main(String[] args) {  
        Vehicle vehicle = new Vehicle("Toyota", "Corolla", 2022);  
        
        Vehicle defaultVehicle = new Vehicle();  
      
	    Vehicle veh=new Vehicle("Tata","Safari"); 
        vehicle.displayInfo();  
        
        defaultVehicle.displayInfo();  
       
	    veh.displayInfo();
    }
   
}
