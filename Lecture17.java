public class Lecture17 {
    // public static int printNumber(int n,int sum) {
    //     if (n == 0 ) {
    //         return sum;
    //     }
    //     sum = sum + printNumber(n-1,sum);
    //     return sum;
    // }
    // public static int factorial(int n){
    //     if(n == 0 || n == 1){
    //         return 1;
    //     }
    //     int fact = factorial(n-1);
    //    int  fact1  = n*fact;
    //    return fact1;
    // }
    public static void fibonacci(int first,int second,int term){
            if(term == 0){
                return;
            }
            int next = first + second;
            System.out.print(" "+next);
            fibonacci(second, next, term-1);
    }
    public static int calPower(int x,int n){
        if(n == 0)
        return 1;
        if(x == 0)
        return 0;
        int xPow = calPower(x, n-1);
        int xPoww = x*xPow;
        return xPoww;
    }
    public static void main(String[] args) {
        // Iteration/loops Functions
        // Print numbers from 5 to 1
            // int n = 8;
            // printNumber(n);
            // 
        //print number from 1 to 5
        // int n = 0;
        // printNumber(n);
        
        //Print sum of n natural number
        // int n = 5;
        // System.out.println(printNumber(n,0));

        //Print factorial.
        // int n = 5;
        // System.out.println(factorial(n));

        //Print fibonacci
        // int first = 0, second = 1 ,term = 9;
        // System.out.print(first+" "+second);
        // fibonacci(first,second,term-2);

        // print x power n
        int x =5,n =4;
        int res = calPower(x, n);
        System.out.println(res);

    }
}
