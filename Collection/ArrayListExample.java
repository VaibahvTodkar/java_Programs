import java.util.ArrayList;

public class ArrayListExample{
    public static void main(String[] args) {
        
        ArrayList<Object> a = new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add("Hello");
        a.add('A');
        a.add(null);


        System.out.println(a);
        System.out.println(a.contains('A'));
        System.out.println(a.isEmpty());
        System.out.println(a.get(3));
        System.out.println(a.remove(2));
        System.out.println(a);
    }
}