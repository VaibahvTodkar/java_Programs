public class FactorialNumber {
    // public static int factorialNumber(int number){
    //     int faactorial = 1;
    //     if(number == 0){
    //         return 1;
    //     }else{
    //         for(int i = 1; i <= number; i++){
    //             faactorial = faactorial * i;
    //         }
    //     }
    //     return faactorial;
    // }

    public static int factorialNumber(int number){
        int Factorial = 1;
        if(number == 0){
            return Factorial;
        }else{
            return (number * factorialNumber(number - 1));
        }
    }
    public static void main(String[] args){
        int number = 5;
        System.out.println("Factorial of " + number + " is " + factorialNumber(number));
    }
}