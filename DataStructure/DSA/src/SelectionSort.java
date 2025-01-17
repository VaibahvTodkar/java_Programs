public class SelectionSort {
    // Time complexity O(n^2);
   
        public static void main(String[] args) {
            int nums[] = {6, 5,2 ,8, 9, 4};
            int size = nums.length ;
            int temp = 0;
    
            System.out.println("Before Sorting :");
            for (int i : nums) {
                System.out.print(i + " ");
            }
    
            int minIndex = 0;        
            for(int i = 0; i < size - 1; i++){
                for(int j = i+1; j <size; j++){
                    if(nums[minIndex] > nums[j]){
                        minIndex = j;
                    }
                }
                temp = nums[minIndex];
                nums[minIndex] =nums[i];
                nums[i] = temp; 

                System.out.println();
                for (int num : nums) {
                    System.out.print(num + " ");
                }
            }
    
            System.out.println();
    
            System.out.println("After Sorting :");
            for (int i : nums) {
                System.out.print(i + " ");
            }
    
        }
    
}
