import java.util.Scanner;

public class ArithmaticOperation {
    public static void main(String[] args) {
        int choice;
        int num1,num2;
        int result;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Addition");
            System.out.println("2. Sustraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            
            System.out.println("Enter your choice : ");
            choice=sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("********************* Addtion *********************  ");
                    System.out.println("Enter Number one :");
                    num1 = sc.nextInt();
                    System.out.println("Enter Number two :");
                    num2 = sc.nextInt();
                    result = num1 + num2;
                    System.out.println("Addition is :" + result);

                    break;
                case 2:
                    System.out.println("********************* Substraction ********************* ");
                    System.out.println("Enter Number one :");
                    num1 = sc.nextInt();
                    System.out.println("Enter Number two :");
                    num2 = sc.nextInt();
                    result = num1 - num2;
                    System.out.println("Substraction is :" + result);
                    break;
                case 3:
                    System.out.println("********************* Multiplication ********************* ");
                    System.out.println("Enter Number one :");
                    num1 = sc.nextInt();
                    System.out.println("Enter Number two :");
                    num2 = sc.nextInt();
                    result = num1 * num2;
                    System.out.println("Multiplication is :" + result);
                    break;
                case 4:
                    System.out.println("********************* Division ********************* ");
                    System.out.println("Enter Number one :");
                    num1 = sc.nextInt();
                    System.out.println("Enter Number two :");
                    num2 = sc.nextInt();
                    result = num1 / num2;
                    System.out.println("Division is :" + result);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        } while(choice != 5);
    }
}
