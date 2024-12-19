public class NegationAndNot {
    public static void main(String[] args) {
        boolean a =true;
        boolean b =false;
        int i = 10;
        int j = -9;

        // int a = 10;
        // int b = 5;
        //     System.out.println(a%b*a+b-a);
        System.err.println(~i);
        System.err.println(~j);
        System.err.println(!a);
        System.err.println(!b);

        System.out.println();

        // -11 -10 -9 -8 -7 -6 -5 -4 -3 -2 -1 0 1 2 3 4 5 6 7 8 9 10 11
        // Positive value start with 0
        // and 
        // Negative value start with -1 

        // so, i = 10 which have negation value -11

        // so, j = -9 which have negation value 8
    }
}
