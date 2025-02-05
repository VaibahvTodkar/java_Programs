import java.util.*;

public class MapCompareEx {
    public static void main(String[] args){
        Map<String, Integer> m1 = new HashMap<>();
        m1.put("A", 1);
        m1.put("B", 2);
        m1.put("C", 3);

        Map<String, Integer> m2 = new HashMap<>();
        m2.put("C", 3);
        m2.put("B", 2);
        m2.put("A", 1);

        Map<String, Integer> m3 = new HashMap<>();
        m3.put("C", 3);
        m3.put("B", 2);
        m3.put("A", 1);

        System.out.println("m1 : "+ m1);
        System.out.println("m2 : "+ m2);
        System.out.println("m3 : "+ m3);

        // comparing key = value
        System.out.println("Comparing key=value");
        System.out.println("m1 = m2 :"+m1.equals(m2));
        System.out.println("m1 = m3 :"+ m1.equals(m3));

        // comparing keys set
        System.out.println("Comparing keys set");
        System.out.println("m1 = m2 :"+ m1.keySet().equals(m2.keySet()));
        System.out.println("m1 = m3 :"+ m1.keySet().equals(m3.keySet()));
        
        // comparing values set
        System.out.println("Comparing value set");
        HashSet<Integer> h1 = new HashSet<>(m1.values());
        HashSet<Integer> h2 = new HashSet<>(m3.values());
        HashSet<Integer> h3 = new HashSet<>(m2.values());

        System.out.println("m1 = m2 : "+ h1.equals(h2));
        System.out.println("m1 = m3 : "+ h2.equals(h3));
        
    }
}