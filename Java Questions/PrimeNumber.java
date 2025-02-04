public class PrimeNumber{
    public static void isPrime(int number){
        boolean flag = false;
        for(int i = 2; i < number; i++){
            if(number % i == 0){
                System.out.println(number + " is not a Prime Number");
                flag = false;
            }else{
                flag = true;
            }

           
        }
         if(flag){
                System.out.println(number + "is a Prime Number");
            } 
    }
    public static void main(String args[]){
        int number = 7;
        isPrime(number);
    }
}