import java.util.*;
import java.util.HashMap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMapEx{
    public static void main(String[] args ){
        Map <String, String> m1 = new TreeMap();
        m1.put("Ram", "22");
        m1.put("Sham", "23");
        m1.put("Vikas", "24");
        m1.put("Akshay", "25");
        m1.put("Rakesh", "24");

        System.out.println(m1);

        System.out.println(m1.containsKey("Rakesh"));
        System.out.println(m1.containsValue("25"));

        System.out.println(m1);
        m1.remove("Sham");
        System.out.println(m1);

        Set s1 = m1.entrySet();    // Set<Map.entry<String, String>> s1 = m1.entrySet();
        System.out.println(s1);

        for(Map.Entry<String, String> s : m1.entrySet()){
            System.out.println(s);
        }

        Iterator<Map.Entry<String, String>> itr = s1.iterator();

        while(itr.hasNext()){
            Entry<String, String> me = itr.next();

            System.out.println(me.getKey());
            System.out.println(me.getValue());
        } 

        
    }
}