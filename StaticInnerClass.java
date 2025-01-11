public class StaticInnerClass {
    static int age = 10;
        
        static class StaticInner {
            void displayAge(){
                System.out.println("Age : " + age);
        }
    }

    public static void main(String[] args) {
    //    StaticInnerClass sic = new StaticInnerClass();
        StaticInnerClass.StaticInner si = new StaticInner();
        // StaticInnerClass.StaticInner.displayAge();
        si.displayAge();
    }
}
