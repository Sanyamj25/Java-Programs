import java.util.*;
public class Lecture7 {
    public static void  printMyName(String name){
        System.out.println("Name is "+name);
    }
    public static int sumNumber(int num1,int num2){
        int sum,mul;
        sum = num1+num2;
        mul = num1 * num2;
        System.out.println("Sum is :"+sum);
        System.out.println("Product is :"+mul);
        return 0;
    }
    public static void main(String[] args) {
        try (//Functions and Methods
                /*
                 ReturnType  functionName(type arg1,type arg2,....){
                 //Operation    }
                  
                 */
        Scanner sc = new Scanner(System.in)) {
            // String name = sc.nextLine();
            // printMyName(name);
            int num1  = sc.nextInt();
            int num2 = sc.nextInt();
            sumNumber(num1, num2);
        }
    }
}
