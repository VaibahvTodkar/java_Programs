import java.util.*;

public class QueueEx{
    public static void main(String[] args){
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(100);
        q1.add(200);
        q1.add(300);
        q1.add(400);
        q1.add(500);

        System.out.println(q1);

        int frount = q1.remove();
        System.out.println(frount);
        System.out.println(q1);

        q1.add(600);
        int pk = q1.peek();
        System.out.println(pk);

        q1.offer(700);  // same as the add method
        System.out.println(q1);

        int p = q1.poll();  //remove element sane as remove method
        System.out.println(p);
        System.out.println(q1);

        int e = q1.element();    // it returns the peek element same as peek method
        System.out.println(e);
        System.out.println(q1);

        q1.add(null);
        System.out.println(q1);

    }
}