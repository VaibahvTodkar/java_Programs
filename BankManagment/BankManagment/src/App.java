import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scannerObj = new Scanner(System.in);
        final String ADMINUSERNAME = "Admin";
        final String ADMINPASSWORD = "Admin@123";
        int adminChoice;
        int accountChoice ;

        // Admin menu 
        do{
            System.out.println("Welcome to Bank Management");
            System.out.println("1. Admin Login");
            System.out.println("2. Create an Account ");
            System.out.println("3. Admin Logout");
            System.out.println("Enter yoour Choice : ");
            adminChoice = scannerObj.nextInt();


            switch(adminChoice){
                case 1 :
                    System.out.println("**************** Admin Login ****************");
                    System.out.println("Enter your Username : ");
                    String userName = scannerObj.next();
                    System.out.println("Enter your Password :");
                    String adminpassword = scannerObj.nextLine();
                    if(ADMINUSERNAME == userName && ADMINPASSWORD == adminpassword){
                        // admin login success logic ;
                    }
                    else 
                    {
                        // admin login fail logic;
                        System.out.println("Wrong username and Password.");
                        break;
                    }
                    break;

                case 2 :
                    System.out.println("**************** Create new Account ****************");
                    System.out.println("Enter user Name :");
                    // scannerObj.nextLine();
                    System.out.println("Enter user Mobile Number :");
                    // scannerObj.nextInt(10);
                    System.out.println("Enter Deposite Amount : ");
                    // scannerObj.nextFloat();

                    System.out.println("Your Aaccount Created Successfully !!!");
                    // write an function to generate an random account unber of 4 digit
                    System.out.println("Account Details are Below :");
                    System.out.println("Account Number :" );
                    System.out.println("Account Holder Name :" );
                    System.out.println("Mobile Number :" );

                    System.out.println("Remember your Account Number....");
                    
                    break;
                
                case 3 : 
                    System.out.println("**************** Admin Logout Success ********************");
                    break;
                
                default :
                    System.out.println("Wrong Choice !!!!!");
            }
        }while(adminChoice != 3);


        do{
           System.out.println("****************** Bank Managemnt System ******************"); 
           System.out.println("Select Option : ");
           System.out.println("1. See all Accounts ");
           System.out.println("2. Deposite Money ");
           System.out.println("3. Withdrow Money ");
           System.out.println("4. Show Balance ");
           System.out.println("5. Show Account Details ");
           System.out.println("6. Logout  ");
           System.out.println("Enter your Choice : ");
            accountChoice = scannerObj.nextInt();
        }while (accountChoice != 6);

        
    }
}
