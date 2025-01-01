public class ArrayEx {
    public static void main(String[] args) {
        int arr[] = {12,3,57,78};
        findmin(arr);
        // int [] arr = new int[7];
        // arr[0] = 10;
        // arr[1] = 20;
        // arr[2] = 30;
        // arr[3] = 40;
        // arr[4] = 50;
        // arr[5] = 60;
        // arr[6] = 70;
        

        // for(int i = 0; i < arr.length; i++){
        //     System.out.println(arr[i]);
        // }

        // for (int i : arr) {
        //     System.out.println(i);
        // }
    }

    static void findmin(int arr[]){
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
