public class Lecture6 {
    public static  void main(String[] args) {
        /*Pattern 1
         
         *      *
         **    **
         ***  ***
         ********
         ***  ***
         **    **
         *      *
          
         */
        // int n = 5;
        // //Uppper half
        // for (int i = 0; i < n; i++) {
        //     //1st half
        //     for (int j = 0; j < i; j++) {
        //         System.out.print("*");
        //     }
        //     //Spaces
        //     for (int j = 0; j < 2*(n-i); j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 0; j < i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //     }

        // //Lower half
        // for (int i = n; i > 0; i--) {
        //     //1st half
        //     for (int j = 0; j < i; j++) {
        //         System.out.print("*");
        //     }
        //     //Spaces
        //     for (int j = 0; j < 2*(n-i); j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 0; j < i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //     }

         //Pattern 2
         /*
             *****
            *****
           *****
          *****
         *****
         */   
        // int n = 5;
        // for (int i = 0; i < n; i++) {
        //     //Spaces
        //     for (int j = 0; j < (n-i); j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 0; j < n; j++) {
        //         System.out.print("*");
        //     }System.out.println();
        // }
            //Pattern 3
            /* 
                 1
                2 2 
               3 3 3
              4 4 4 4
             5 5 5 5 5
             */
            // int n = 6;
            // for (int i = 0; i < n; i++) {
            //     for (int j = 0; j < (n-i); j++) {
            //         System.out.print(" ");
            //     }
            //     for (int j = 0, count = 0; j < i; j++,count++) {
            //         if(count != i)
            //         System.out.print(i+" ");
            //     }
                
            //     System.out.println();
            // }
            //Pattern 4
            /*
                     1 
                   2 1 2
                 3 2 1 2 3
               4 3 2 1 2 3 4
             5 4 3 2 1 2 3 4 5
             */
    //         int n = 5;
    //     for (int i = 1; i <= n; i++) {
    //         for (int j = 1; j <= (n-i); j++) {
    //             System.out.print(" ");
    //         }
    //         //1st half
    //         for (int j = i; j >= 1; j--) {
    //             System.out.print(j);
    //         }
    //         //2nd half
    //         for (int j = 2; j <=i; j++) {
    //             System.out.print(j);
    //         }
    //         System.out.println();
    //     }

        //Pattern 5
            /* 
                * 
               ***
              *****
             *******
              *****
               ***
                * 
             */
            int n = 5;
            //Upper half
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < (n-i); j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < (2*i)-1; j++) {
                    System.out.print("*");
                }
                
                System.out.println();   
            }
            //Lower half
            for (int i = n; i >=1; i--) {
                for (int j = 0; j < (n-i); j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < (2*i)-1; j++) {
                    System.out.print("*");
                }
                
                System.out.println();                
            }


    }
}
