import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Java");
        list.add("PHP");
        list.add("Python");
        list.add("C++");

        System.out.println(list);

        list.add("Javascript");
        System.out.println(list);

        list.addFirst("C");
        list.add("Rubby");
        System.out.println(list);

        System.out.println(list.get(2));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        // System.out.println("Before Detete :");
        // System.out.println(list);
        // System.out.println("After Delete : ");
        // list.remove("C++");
        // list.remove(3);
        // System.out.println(list);

        for (String item : list) {
            System.out.println(item);
        }

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Before Sorting :");
        System.out.println(list);
        System.out.println("Sorting the LinkedList : ");
        Collections.sort(list);
        System.out.println(list);

        System.out.println("Clearing the List : ");
        list.clear();
        System.out.println(list);
    }
}
