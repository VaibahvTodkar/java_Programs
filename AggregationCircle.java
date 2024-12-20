class SquareOperaation{
    int square(int n){
        return n*n;
    }
}


public class AggregationCircle {
    int radius;
    float area;
    public void circleArea(int radius){
        SquareOperaation s = new SquareOperaation();
        area = (float) (3.14 * (s.square(radius)));
        System.out.println("Area : "+area);
    }

    public static void main(String[] args) {
        AggregationCircle c = new AggregationCircle();
        c.circleArea(7);
    }
}
