public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            int data = 50/0;
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println(e);
        }
        finally {
            System.out.println("finally block executed");
        }
        System.out.println("rest of code");
    }
}
