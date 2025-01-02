
public class StringMethods {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter an String : ");
        // String s = sc.nextLine();

        String s = "Hello World";
        String s1 = "Hello World";
        int len = s.length();
        System.out.println("Length of String is " + len);
        System.out.println("Character at 7 :"+ s.charAt(6));
        System.out.println("Index of o :" + s.indexOf('o'));
        System.out.println("Index of World :"+ s.indexOf("World"));

        System.out.println("String compare : "+ s.equals(s1));
        System.out.println("String compare using equal ignore case : "+ s.equalsIgnoreCase(s1));
        // System.out.println("String compare : "+ s.compareTo(s1));


        String gMail = "vaibhav.todkar@gmail.com";

        System.out.println("Ends with @gmail.com : "+ gMail.endsWith("@gmail.com"));
    }
}
