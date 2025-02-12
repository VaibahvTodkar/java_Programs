import java.util.*;

class CustomIntegerComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            return o1 < o2 ? 1 : -1;
        }
}

public class PriorityQueueEx{
    public static void main(String[] args){
        Queue<Integer> testIntegersPQ = new PriorityQueue<>(new CustomIntegerComparator());
        testIntegersPQ.add(11);
        System.out.println(testIntegersPQ);
        testIntegersPQ.add(5);
        System.out.println(testIntegersPQ);
        testIntegersPQ.add(-1);
        System.out.println(testIntegersPQ);
        testIntegersPQ.add(12);
        System.out.println(testIntegersPQ);
        testIntegersPQ.add(6);
        System.out.println(testIntegersPQ);

        System.out.println("Integers stored in reverse order of priority in a Priority Queue\n");
        while (!testIntegersPQ.isEmpty()) {
            System.out.println(testIntegersPQ.poll());
        }

        // Queue<String> testStringsPQ = new PriorityQueue<>();
        // testStringsPQ.add("abcd");
        // testStringsPQ.add("1234");
        // testStringsPQ.add("23bc");
        // testStringsPQ.add("zzxx");
        // testStringsPQ.add("abxy");

        // System.out.println(testStringsPQ);

        // System.out.println("Strings Stored in Natural Ordering in a Priority Queue\n");
        // while (!testStringsPQ.isEmpty()) {
        //     System.out.println(testStringsPQ.poll());
        // }



        // PriorityQueue<Integer> q1 = new PriorityQueue<>();
        // q1.add(4);
        // q1.add(2);
        
        // System.out.println(q1);
        // q1.add(1);

        // System.out.println(q1);

        // q1.add(0);
        // System.out.println(q1);
        // q1.remove();
        // System.out.println(q1.element());


        

    }
}