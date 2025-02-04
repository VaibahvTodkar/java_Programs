import java.util.*;
public class RandomNumberGenerator{
    public static void main(String[] args){
        // using Math class 
        System.out.println("Random Number : " + (int)(Math.random() * 100000));

        // using Random class
        Random r = new Random();
        int i = r.nextInt(100000);
        System.out.println(i); 
    }
}