public class ConstructorOverloading {
    int vehicle_id;
    String vehicle_name;
    String Vehicle_clolr;
    ConstructorOverloading(int a, String b){
        vehicle_id = a;
        vehicle_name = b;
    }
    ConstructorOverloading(int a, String b, String c){
        vehicle_id = a;
        vehicle_name = b;
        Vehicle_clolr = c;
    }
    
    public void display(){
        System.out.println("Vehicle Id : "+vehicle_id+"\nVehicle Name :"+vehicle_name+"\nVehicle Clolr :"+Vehicle_clolr);
    }

    public static void main(String[] args) {
        ConstructorOverloading c1 = new ConstructorOverloading(10, "Land Rover");
        ConstructorOverloading c2 = new ConstructorOverloading(10, "Land Rover","White");
        c1.display();
        c2.display();
    
    }
}
