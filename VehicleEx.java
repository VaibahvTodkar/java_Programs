// Instance Block 
class Vehicle {
    Vehicle(){
        System.out.println("Vehicle class Constructor");
    }
    {
        System.out.println("Parent instance block");

    }
}
public class VehicleEx extends Vehicle {
    int speed;
    VehicleEx(){
        System.out.println("Vehicle Speed : "+speed);
    }
    {
        speed = 100;
        System.out.println("Vehicle is running Instance Block ");
        // speed = 10;
    }


    public static void main(String[] args) {
        VehicleEx v = new VehicleEx();

    }
}


// // Instance Block 
// public class VehicleEx {
//     int speed;
//     VehicleEx(){
//         System.out.println("Vehicle Speed : "+speed);
//     }
//     {
//         System.out.println("Vehicle is running Instance Block ");
//         // speed = 10;
//     }


//     public static void main(String[] args) {
//         VehicleEx v = new VehicleEx();

//     }
// }
