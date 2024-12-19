public class ArmstrongNumber {
    public static int power(int rem, int n){
        int  res = 1;
        for(int i = 1; i <= n; i++){
            res = rem * rem;
        }
        System.out.println(res);
        return res;
    }
    public static void main(String[] args) {
        int num = 371, n = 0, rem = 0;
        int sum = 0;
        int originalnumber = num;
        int originalnumber2 = num;
        while (num != 0) {
            num = num / 10;
            n++;
        }

        while (originalnumber != 0) {
            rem = originalnumber % 10;
            // sum = (int) (Math.pow(rem, n) + sum);
            sum += power(rem, n);
            originalnumber = originalnumber / 10;

        }

        if (originalnumber2 == sum) {
            System.out.println("Armstrong number");
        }else{
            System.out.println("Not armstrong number");
        }




        // // reverse number logic
        // int n = 27, rem, revnum=0;
        // while(n != 0){
        //     rem = n % 10;
        //     revnum = rem + (revnum * 10);
        //     n = n / 10;

        // }
        // System.out.println(revnum);
    }
}
