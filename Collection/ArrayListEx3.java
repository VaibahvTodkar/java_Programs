import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListEx3 {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(23);
        ar.add(34);
        ar.add(2);
        ar.add(3);
        ar.add(22);

        System.out.println("ArrayList");

        System.out.println(ar);
        System.out.println("ArrayList");
        for (Integer integer : ar) {
            System.out.println(integer);
        }

        System.out.println("ArrayList");
        Iterator<Integer> itr = ar.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("ArrayList");
        ar.forEach(System.out::println);


        System.out.println(ar.get(0));
        System.out.println(ar.contains(22));

        ar.add(3, 101);
        System.out.println(ar);

        ar.remove(2);
        System.out.println(ar);

        System.out.println("Before Sorted :");
        System.out.println(ar);
        Collections.sort(ar);
        System.out.println("sorted ArrayList : ");
        System.out.println(ar);
        System.out.println("Arraylist is Empty :");
        System.out.println(ar.isEmpty());
    }
}
