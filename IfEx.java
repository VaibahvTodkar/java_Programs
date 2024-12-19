public class IfEx {
    public static void main(String[] args) {

        String s = "Round 1";
        if (s == "Round 1") {
            s = "Round 2";
            if (s == "Round 2") {
                s = "Round 3";
                if (s == "Round 3") {
                    System.out.println("selected");
                }
            }else{
                System.out.println("Rejected");
            }
        }else{
            System.out.println("Rejected");
        }


        
        // String signal_state = "";
        
        // if (signal_state == "Red"){
        //     System.out.println("Stop");
        // }else if (signal_state == "Yellow") {
        //     System.out.println("See around");
        // }else if (signal_state == "Green") {
        //     System.out.println("Go");
        // }else {
        //     System.out.println("Signal is in Maintaince state \n You can check LEFT and RIGHT and GO");
        // }


        // int num = 12;
        // if(num > 0){
        //     System.out.println("Positive Number");
        // }else{
        //     System.out.println("Negative Number");

        // }

        


        // int age = 19;
        // if(age > 18){
        //     System.out.println("Valid voter");
        // }else{
        //     System.out.println("InValid voter");

        // }

        // int oddcount = 0, evencount = 0, i;

        // for(i = 1; i <= 10; i++){
        //     if (i % 2 == 0){
        //         evencount++;
        //     }else{
        //         oddcount++;
        //     }
        // }

        // System.out.println("Oddcount :" +oddcount);
        // System.out.println("evencount :" +evencount);


        // int a = 10;
        // if(a > 0){
        //     System.out.println("IF Executed");
        // }
        // else{
        //     System.out.println("If not Executed");
        // }
    }
}
