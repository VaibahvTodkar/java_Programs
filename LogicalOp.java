public class LogicalOp {
    public static void main(String[] args) {
        int var = 5, var1 = 10, var2 = 5;
        System.out.println("Variable 1 :"+ var);
        System.out.println("Variable 2 :"+ var1);
        System.out.println("Variable 3 :"+ var2);
        
        if (var < var1 && var == var2 && var1 > var2){
            System.out.println("If block executed");
        }else {
            System.out.println("Else block executed");
        }

        if (var < var1 && var == var2 && var1 < var2){
            System.out.println("If block executed");
        }else {
            System.out.println("Else block executed");
        }

        if (var < var1 || var == var2 || var1 > var2){
            System.out.println("If block executed");
        }else {
            System.out.println("Else block executed");
        }
    }
}
