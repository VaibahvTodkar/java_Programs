class A {
    int age = 10;

    void displayAge(){
        class B {
            String name = "VaibhavTokdar";
            void innerAgeDisplay(){
                System.out.println("Age is : " + age);
                System.out.println("Name is : " + name);
            }
        }
        B b1 = new B();
        b1.innerAgeDisplay();
    }
}

public class LocalInnerClass {
    public static void main(String[] args) {
        A a = new A();
        a.displayAge();
    }
}
