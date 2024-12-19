public class ParameterizedConstructor {
    int vehicle_id;
    String vehicl_name;

    ParameterizedConstructor(){
        System.out.println("Defoult Constructor Executed");
    }

    ParameterizedConstructor(int vehicle_id, String vehicl_name){
        this.vehicle_id = vehicle_id;
        this.vehicl_name = vehicl_name;
    }

    public void display(){
        System.out.println("Vehicle ID : "+vehicle_id+"\nVehicle Name :"+vehicl_name);
    }

    public static void main(String[] args) {
        ParameterizedConstructor p1 = new ParameterizedConstructor(10, "Land Rover");
        ParameterizedConstructor p2 = new ParameterizedConstructor(20, "Fortuner");
        ParameterizedConstructor p3 = new ParameterizedConstructor();
        p1.display();
        p2.display();
        p3.display();
    }

}
