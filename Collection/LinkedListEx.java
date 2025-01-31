import java.util.*;  
public class LinkedListEx{  
 public static void main(String args[]){  
  
  LinkedList<Integer> al=new LinkedList<Integer>();  
  al.add(123);  
  al.add(12);  
  al.add(234);  
  al.add(2);  
  
  Collections.sort(al);
  ListIterator<Integer> itr=al.listIterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
  

    // while (itr.hasPrevious()) {
    //     System.out.println(itr.previous());
    // }

 }  
}  