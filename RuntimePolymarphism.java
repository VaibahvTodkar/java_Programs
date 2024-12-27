class A {
    // int a = 50;
    // public void eat(){
    //     System.out.println("Parent eat Method");
    // }
}

public class RuntimePolymarphism extends A {
    // int a = 150;
    // public void eat(){
    //     System.out.println("Child class eat method");
    // }
    public static void main(String[] args) {
        // A a = new RuntimePolymarphism();                         // Runtime Polymarphism Upcasting 
        // a.eat();                                                 // overridden method child class method executed                   
        // System.out.println("A : "+ a.a);                          // variavle of parent class is executed  

        // A a = new RuntimePolymarphism();
        // System.out.println(a instanceof A);                            // True 
        // System.out.println(a instanceof RuntimePolymarphism);           // True

        // A a = new A();
        // System.out.println(a instanceof A);                            // true
        // System.out.println(a instanceof RuntimePolymarphism);           // false

        // RuntimePolymarphism a = new RuntimePolymarphism();
        // System.out.println(a instanceof A);                            // true
        // System.out.println(a instanceof RuntimePolymarphism);           // true

        // RuntimePolymarphism r = new A();              // downcasting is not possible

        // A a = null;   
        // System.out.println(a instanceof A);                     // false            
        // System.out.println(a instanceof RuntimePolymarphism);   // false                           
    }

}
