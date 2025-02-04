public class PalindromeNumber{
    public static void main(String args[]){
        int number = 1234321;
        int original = number;
        int reverse = 0;

        while(number > 0 ){
            int remender = number % 10;
            reverse = (reverse * 10 ) + remender;
            number = number / 10;
        }

        if(reverse == original){
            System.out.println("Number is Palindrome");
        }else{
            System.out.println("Number is Not Palindrome");
        }
        
    }
}