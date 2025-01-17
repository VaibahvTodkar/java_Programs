public class NestedTry {
    public static void main(String[] args) {
        try {
            
            try {
                String s = null;
                System.out.println(s.length());
            } catch (NullPointerException e) {
                // TODO: handle exception
                System.out.println(e);
            }

           try {
            int arr[] = {1, 2, 3};
            System.out.println(arr[10]);
           } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println(e);
           }

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

       
    }
}
