public class MathOperation {
    public void add(int a, int b){
        System.out.println("A+B : "+(a+b));
    }
    public void add(double c, double d, double e){
        System.out.println("C+D+E : " +(c+d+e));
    }
    
    public static void main(String[] args) {
        MathOperation op = new MathOperation();
        op.add(10, 20);
        op.add(3.14, 1.1, 0.25);
    }
}
