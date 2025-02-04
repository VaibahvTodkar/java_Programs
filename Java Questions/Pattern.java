public class Pattern{
    public static void main(String args[]){
        // Right triangle pattern 
        // *
        // **
        // ***
        // ****
        // *****

        // for(int i = 0; i < 6; i++){
        //     for(int j = 0; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // // Left Triangle Star Pattern
        //     //  *
        //     // **
        // //    ***
        // //   ****
        // //  *****  
        // int row = 6;
        // for(int i = 0; i < row; i++){
        //     for(int j = 2*row-i; j >= 0; j--){
        //         System.out.print(" ");
        //     }
        //     for(int k = 0; k < i; k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }   

        // Pyramid Star Pattern
        //     *
        //     * *
        //    * * *
        //   * * * *
        //  * * * * *
        // * * * * * *

        int row = 6;
        for(int i = 0; i < row; i++){
            for(int j = row-i; j>1; j--){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
       


    }
}