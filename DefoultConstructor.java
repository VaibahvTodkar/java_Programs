// class Vehicle{
//     Vehicle(){
//         System.out.println("Vehicle Constructor");
//     }
// }

public class DefoultConstructor {
    int id;
    String sname ;
    public void display(){
        System.out.println("ID : "+id+"\nName : "+sname);
    }
    public static void main(String[] args) {
    //    Vehicle v = new Vehicle(); 
        DefoultConstructor d = new DefoultConstructor();
        d.display();
    }
}
