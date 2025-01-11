public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        int nums [] = {5, 7, 9, 13, 17};
        int target = 11;

        int result = linearSearch(nums, target);

        if(result != -1){
            System.out.println("Element Found At Index : " +result);
        }else {
            System.out.println("Element Not Found");
        }

    }
 
    private static int linearSearch(int[] nums, int target){
        return -1;
    }
}
