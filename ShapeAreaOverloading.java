public class ShapeAreaOverloading {

    public void area(int r){
        double a = 3.14*r*r;
        System.out.println("Area of circle : "+a);
    }

    public void area(int l, int h){
        double a = l * h;
        System.out.println("Area of Rechangle : "+a);
    }
    

    public static void main(String[] args) {
        ShapeAreaOverloading s = new ShapeAreaOverloading();
        s.area(10);
        s.area(5, 5);
    }
}