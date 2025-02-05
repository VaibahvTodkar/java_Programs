import java.util.*;

public class StackEx {
    public static void main(String[] args){
        Stack<Integer> s1 = new Stack<>();
        s1.push(11);
        s1.push(12);
        s1.push(13);
        s1.push(14);
        s1.push(15);

        System.out.println(s1);
        s1.pop();
        System.out.println(s1);

        System.out.println(s1.peek());
        System.out.println(s1.isEmpty());
        System.out.println(s1.search(13));

    }
}