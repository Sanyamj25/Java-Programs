public class Lecture5 {
    public static void main(String[] args) {
        /* Pattern 1
         ****
         ****
         ****
         ****
          */
        // for (int i = 0; i < 5; i++) {
        //     for (int j = 0; j < 5; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        /* Pattern 2
         ********
         *      *
         *      *
         *      *
         *      *
         ********
         */
        // int row = 5,col = 5;
        // for (int i = 0; i < row; i++) {
        //     for (int j = 0; j < col; j++) {
        //         if(i == 0 || i == row-1 || j == 0 || j == col-1){
        //             System.out.print("*");
        //        } else{
        //         System.out.print(" ");
        //        }               
        //     }
        //     System.out.println();
        // }
        /* pattern 3
         * 
         **
         ***
         ****
         */
        // for (int i = 0; i < 5; i++) {
        //     for (int j = 0; j < i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        /* pattern 4
        ****
        ***
        **
        * 
         */
        // for (int i = 5; i > 0; i--) {
        //     for (int j = 0; j < i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        /* pattern 5
            *
           **
          ***
         ****
        *****
        */
        // for (int i = 0; i < 5; i++) {
        //     for (int j = 0; j < (5-i); j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 0; j < i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        /* pattern 6
        1
        12
        123
        1234
        12345
        */
        // int n=5;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        /* pattern 7
        12345
        1234
        123
        12
        1
        */
        // int n=5;
        // for (int i = n; i >= 1; i--) {
        //     for (int j = 1; j <= n-i; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        /* pattern 8
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15
        */
        // int n=5,num=1;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++,num++) {
        //         System.out.print(num+" ");
        //     }
        //     System.out.println();
        // }

        /* pattern 9
        1
        0 1
        1 0 1
        0 1 0 1
        1 0 1 0 1
        */
        int n=5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if((i+j)%2 == 0){
                    System.out.print("1 ");
                } else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

    }
}
