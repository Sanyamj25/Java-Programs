import java.util.*;
public class Lecture2 {
    public static void main(String[] args) {
        //Variables in java
                /*  System ---> Class
                    out ---> 
                    print/printf/println ---> Function
                 */
                //Print he pattern
                // System.out.println("Pattern");
                // int  row = 4,col = 5;
                // for (int i = 0; i <= row; i++) {
                //     for (int j = 0; j <= i; j++) {
                //         System.out.print("* ");
                //     }
                //     System.out.println();
                // }
                /*  2*(a+b)===> 2 is constant and a & b are Variable 
                  Data types in Java
                  1.Primitive             |      2.Non-Primitive
                __________________________|_______________________
                  byte,sort,char          | String,array,class,Object,Interface
                boolean,int,long,double   | 
                */
            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your string");
            String name = sc.nextLine();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a+b;
            System.out.println(name);
            System.out.println(sum);
        

    }
}
