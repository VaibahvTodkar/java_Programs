public class VariableTest {
    static int staticVar=100;
    static void method(){
        int localVar=90;
        System.out.println("Local Variable "+ localVar);
    }
    void run(){
        int localVar2 = 200;
        System.out.println("Local variaable 2 "+ localVar2);
        System.out.println("Static Variable "+ staticVar);
    }
    public static void main(String[] args) {
        int instanceVar = 50;
        System.out.println("Instance Variable "+instanceVar);
        System.out.println("Static Variable "+ staticVar);
        method();
        VariableTest obj = new VariableTest();
        obj.run();
    }
}

