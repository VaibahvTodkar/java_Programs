public class InnerOuterDemo {
    private int data = 10;

    class InnderDemo{
        public void display(){
            System.out.println("Data : " + data);
        }
    }

    public static void main(String[] args) {
        InnerOuterDemo ind = new InnerOuterDemo();
        InnerOuterDemo.InnderDemo id = ind.new InnderDemo();
        id.display();;
    }
}
