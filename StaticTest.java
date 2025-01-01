class Sample {
    int x;
    static int y;

    Sample(int a, int b){
        x = a;
        y = b;
    }

    static void display(){
        System.out.println(" Y :"+y);
    }

}

public class StaticTest {
    public static void main(String[] args) {
        Sample.display();
        Sample s = new Sample(10, 10);
        Sample s2 = new Sample(20, 50);
        Sample.display();
    }

}
