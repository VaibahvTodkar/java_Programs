public class PreDefinedMethodDemo {
    // public  void findMax(){
    //      int num1 = 10, num2 = 9;
    //     if (num1 > num2){
    //         System.out.println("Number 1 is greater value is : "+num1);
    //     }else{
    //         System.out.println("Number 2 is greater value is : "+num2);
    //     }
    // }
    public void addNum(int num1,int num2){
        int res = num1 + num2;
        System.out.println("Addition is : " + res);
    }

    public static void main(String[] args) {
        // System.out.println("Maximum Element : "+Math.max(10, 9));
        PreDefinedMethodDemo ob = new PreDefinedMethodDemo();
        // ob.findMax();
        int num1 = 10, num2 = 100;
        ob.addNum(num1,num2);
        
    }
}
