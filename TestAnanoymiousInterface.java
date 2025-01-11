interface Eatable{
    void eat();
}
public class TestAnanoymiousInterface {
    public static void main(String[] args) {
        Eatable e = new Eatable() {
            public void eat(){
                System.out.println("Food is nice");
            }
        };
        e.eat();
    }
}
