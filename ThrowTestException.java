public class ThrowTestException {
    public void validate(int age) {

        if (age < 18) {
            throw new ArithmeticException("You are not Eligible for voting");
        } else {
            System.out.println("You are Eligible for voting");
        }

    }

    public static void main(String[] args) {
        ThrowTestException t = new ThrowTestException();
        t.validate(15);
    }
}
