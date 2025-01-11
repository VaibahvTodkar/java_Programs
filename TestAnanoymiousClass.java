abstract class Dog{
    abstract void eat();
}
public class TestAnanoymiousClass {
    public static void main(String[] args) {
        Dog d = new Dog() {
            void eat(){
                System.out.println("Dog is Eating");
                System.out.println("Food is Nice");
            }
        };

        d.eat();
    }
}
