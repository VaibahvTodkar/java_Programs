public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        int nums [] = {5, 7, 9, 13, 17};
        int target = 22;

        // int result = linearSearch(nums, target);
        int result = binarysearch(nums, target);

        if(result != -1){
            System.out.println("Element Found At Index : " +result);
        }else {
            System.out.println("Element Not Found");
        }

    }
 
    private static int linearSearch(int[] nums, int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target)
                return i;
        }
        return -1;
    }

    private static int binarysearch(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right)/2;
            if (nums[mid] == target) {
                return mid;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return -1;
    }
}
