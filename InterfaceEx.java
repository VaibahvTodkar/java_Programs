interface display {
    final int var_display = 10;
    void display();

    default void msg(){
        System.out.println("Defoult method of the display class");
    }
}

interface movable {
    final int var_movable = 100;
    void move();
}

class SampleEx implements display, movable {
    public void display(){System.out.println("Display interface "+ var_display);}
    public void move(){System.out.println("Movable interface "+ var_movable);}
}

public class InterfaceEx {
    public static void main(String[] args) {
        display d = new SampleEx();   // upcasting
        
        d.display();
        d.msg();

        movable m = new SampleEx();
        m.move();

        // SampleEx s = new SampleEx();
        // s.display();
        // s.move();
        // s.msg();
    }
}
