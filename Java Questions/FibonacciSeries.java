public class FibonacciSeries {
    public static void main(String[] args){
        int first = 0;
        int second = 1;
        int third;

        System.out.println(first);
        System.out.println(second);
        for(int i = 2; i < 10; i++){
            third = first + second;
            System.out.println(third);
            first = second;
            second = third;
        }
    }
}