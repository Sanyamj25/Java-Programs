import java.util.*;
public class Lecture11 {
    public static void main(String[] args) {
        //2D array in java
        /* int [][] marks = new int [3][3]; */
        @SuppressWarnings("resource")
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            arr[i][j] = sc.nextInt();
        }
    }
    System.out.println("arrays");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
    }
}
