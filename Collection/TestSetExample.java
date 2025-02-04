import java.util.*;

public class TestSetExample{
    public static void main(String[] args){
        int arr[] = {11,22,33,44,55,66,77,22};
        Set<Integer> s1 = new LinkedHashSet<Integer>();
        for(int i = 0; i < arr.length; i++){
            s1.add(arr[i]);
        }

        System.out.println(s1);

        // s1.clear();   // Remove all elements
        // System.out.println(s1);


        System.out.println(s1.contains(22)); // to check 
        System.out.println(s1.isEmpty()); // to check set is empty

        System.out.println(s1.remove(22));
        System.out.println(s1);

        System.out.println(s1.size()); // to find the size of an set
        

        Iterator<Integer> itr = s1.iterator();

        while(itr.hasNext()){
            // Object ele = ;
            System.out.println(itr.next());
        }

        
        System.out.println(s2);
    }
}