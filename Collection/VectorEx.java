import java.util.Vector;
import java.util.*;

public class VectorEx {
    public static void main(String[] args){
        Vector<Integer> v1 = new Vector<Integer>();
        System.out.println(v1.capacity());

        v1.add(100);
        v1.add(200);
        v1.add(null);
        v1.add(null);
        v1.add(20);
        v1.add(50);

        System.out.println(v1);

        v1.remove(2);  // remving
        System.out.println(v1);

        v1.insertElementAt(11, 2);  // inserting at index 2
        System.out.println(v1);

        System.out.println(v1.capacity());  // print the capacity

        // for(Integer v : v1){
        //     System.out.println(v);
        // }
    }
}
