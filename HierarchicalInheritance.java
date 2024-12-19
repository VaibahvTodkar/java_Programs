class FindArea{
    public void area(){
        System.out.println("Area Method of FindArea class");
    }
}

class  Circle extends FindArea{
    public void printarea(){
        System.out.println("Area of circle");
    }
}

class  Square extends FindArea{
    public void printarea(){
        System.out.println("Area of square");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.area();
        c.printarea();

        Square s =new Square();
        s.area();
        s.printarea();
    }
}
