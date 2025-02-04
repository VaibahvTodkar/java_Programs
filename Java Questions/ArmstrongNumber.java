public class ArmstrongNumber{
    static void isArmstrong(int number){
        int len = 0;
        int original = number;
        int originalnum = number;
        int armstrong = 0;
        while(number != 0){
            number = number / 10;
            len++;
        }

        while ( original > 0){
            int remender = original % 10;
            armstrong = armstrong + (int)(Math.pow(remender,len));
            original = original / 10;
        }

        if(armstrong == originalnum){
            System.out.println("Number is Armstrong Number");
        }else{
            System.out.println("Number is Not Armstrong Number");
        }

    }

    public static void main(String args[]){
        int number = 153;

        isArmstrong(number);
    }
}