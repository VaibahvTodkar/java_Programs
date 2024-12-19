public class AssignmentOp {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        String name = "Vaibhav";
        System.out.println("Name :"+ name);
        a += b;
        System.out.println("Addition  A: " + a + " B:" + b);
        a = b;
        System.out.println("Substraction  A: " + a + " B:" + b);
        a *= b;
        System.out.println("Multiplication  A: " + a + " B:" + b);
        a /= b;
        System.out.println("Division  A: " + a + " B:" + b);
        a %= b;
        System.out.println("Mod   A: " + a + " B:" + b);
    }
}
