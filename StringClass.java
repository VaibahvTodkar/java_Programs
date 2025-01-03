public class StringClass {
    public static void main(String[] args) {

        String s1 = new String("Hello");
        String s2  = "Hello";
        String s3 = "Hello";
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        System.out.println(s1.compareTo(s2));

        System.out.println(s3.equals(s2));
        System.out.println(s3 == s2);
        System.out.println(s3.compareTo(s2));

        

        // ==, equals(), compareTo(), equalsIgnoreCase() Main points
        // String s = new String("Hello");
        // String s1 = new String("Everyone");
        // String s2 = "Hello";
        // String s3 = "Hello";
        // System.out.println("S : " + s);
        // System.out.println("S : " + s.hashCode());
        // System.out.println("S1 : " + s1);
        // System.out.println("S1 : " + s1.hashCode());
        // System.out.println("S2 : " + s2);
        // System.out.println("S2 : " + s2.hashCode());
        // System.out.println("S3 : " + s3);
        // System.out.println("S3 : " + s3.hashCode());
        // System.out.println("S3 == S2 : " + (s3 == s2)); // object
        // System.out.println("S3.equals(S2) : " + s3.equals(s2)); // reference
        // System.out.println("S3.compareTo(S2) : " + s3.compareTo(s2)); // sorting





        // Address are the same in string constant pool
        // String fname = "Vaibhav";
        // String lname = "Todkar";
        // fname.concat(lname);
        // System.out.println(fname.concat(lname).hashCode());
        // System.out.println("First Name : "+ fname);
        // System.out.println("First Name : "+ fname.hashCode());
        // System.out.println("Last Name : "+ lname);
        // System.out.println("Last Name : "+ lname.hashCode());
        // String s3 = "VaibhavTodkar";
        // System.out.println("S3 : " + s3);
        // System.out.println("S3 : " + s3.hashCode());
        // String s4 = fname.concat(lname);
        // System.out.println("S4 : " + s4);
        // System.out.println("S4 : " + s4.hashCode());

    }
}
