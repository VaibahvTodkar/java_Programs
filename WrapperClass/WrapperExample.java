import java.util.ArrayList;
import java.util.List;

public class WrapperExample {

    public static void main(String[] args) {
        int a = 10;
        // Integer intobj = new Integer(a);
        Integer intobj = a;    // autoboxing
        System.out.println(a);
        System.out.println(intobj);

        // int b = intobj;           // unboxing
        int b = intobj.intValue();    // using intValue() function
        System.out.println(b);

        Object o = new Object();
    }
}