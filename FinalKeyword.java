// final methid we can inherit but can not create an copy of it 
class Vehicle{
    final void run(){
        System.out.println("Final method of Vehicle");
    }
}

public class FinalKeyword extends Vehicle{
    

    public static void main(String[] args) {
        FinalKeyword f = new FinalKeyword();
        f.run();
    }
}




// final class we can not inherit or extend

// final class Vehicle{
//     void run(){
//         System.out.println("Final method of Vehicle");
//     }
// }

// public class FinalKeyword extends Vehicle{
//     // final int speed = 100;

//     void run(){
//         // speed = 130;
//         System.out.println("Final method of child class");
//     }

//     public static void main(String[] args) {
//         FinalKeyword f = new FinalKeyword();
//         f.run();
//     }
// }







// we can not override the final method

// class Vehicle{
//     final void run(){
//         System.out.println("Final method of Vehicle");
//     }
// }

// public class FinalKeyword extends Vehicle{
//     // final int speed = 100;

//     void run(){
//         // speed = 130;
//         System.out.println("Final method of child class");
//     }

//     public static void main(String[] args) {
//         FinalKeyword f = new FinalKeyword();
//         f.run();
//     }
// }






// public class FinalKeyword {
//     final int speed = 100;

//     void run(){
//         // speed = 130;
//         System.out.println(speed);
//     }

//     public static void main(String[] args) {
//         FinalKeyword f = new FinalKeyword();
//         f.run();
//     }
// }

// at creating final variable we need to assign value;