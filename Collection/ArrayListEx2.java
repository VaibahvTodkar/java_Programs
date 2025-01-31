import java.util.ArrayList;

public class ArrayListEx2 {

    public static void addElement(Object o, ArrayList ar){
        ar.add(o);
    }

    public static boolean add(Object o){
        
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Object> ar = new ArrayList<>();
        addElement(10, ar);

        System.out.println(ar);

    } 
}
