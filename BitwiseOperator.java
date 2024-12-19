public class BitwiseOperator {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 2;
        System.out.println("Bitwise OR " + (num1 | num2) );
        System.out.println("Bitwise AND " + (num1 & num2) );
        System.out.println("Bitwise X-OR " + (num1 ^ num2) );
        System.out.println("Bitwise X-OR " + ~(num1 ^ num2) );
        System.out.println("1's complement : " + ~num1);
        System.out.println("2's complement : " + ~((~num1)+1));
        System.out.println("bitwise shift : " + (num1 << 1));
        System.out.println("bitwise shift 10 by 1: " + (num2 << 1));
        System.out.println("bitwise shift  10 by 2: " + (num2 << 2));
        System.out.println("bitwise shif rightt 10 by 1: " + (num2 << 1));
        System.out.println("bitwise shift right  10 by 2: " + (num2 >> 2));
        System.out.println("bitwise shift right  10 by 2: " + (num2 >>> 2));
        System.out.println("bitwise shift right  10 by 2: " + (num2 >> 2));
        // System.out.println("bitwise shift  10 by 2: " + (num2 << 2));

        // 0000 1010
        // 1000 0010
    }
}
