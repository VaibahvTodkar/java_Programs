abstract class Shape{
    abstract void drow();
}

class Circle extends Shape{
    void drow(){
        System.out.println("Shape Circle");
    }
}

class Square extends Shape{
    void drow(){
        System.out.println("Shape Square");
    }
}

public class ShapeAbstractClassEx {
    public static void main(String[] args) {
        Circle c = new Circle();
        Square s = new Square();
        c.drow();

        s.drow();
    }
}
