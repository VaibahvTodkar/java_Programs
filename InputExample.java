import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Employee name :");
        String name = sc.nextLine();
        System.out.println("Enter a Employee Age :");
        int age = sc.nextInt();
        System.out.println("Enter a Employee Salary :");
        float salary = sc.nextFloat();

        System.out.println("Employee Name : "+ name);
        System.out.println("Employee age : "+ age);
        System.out.println("Employee Salary : "+ salary);

        // System.out.println("Enter a Number :");
        // int number = sc.nextInt();
        // System.out.println("Number " + number);
    }
}
