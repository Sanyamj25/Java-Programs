import java.util.*;

public class Lecture10 {
    public static void main(String[] args) {
        // Arrays in java
        /* type []arrayName = new type[size] */
        // int marks [] = new int[4];
        // marks[0] = 67;
        // marks[1] = 86;
        // marks[2] = 87;
        // System.out.println(marks);//Produce an error
        // for (int i = 0; i < marks.length; i++) {
        // System.out.println(marks[i]);
        // }
        // for (int i : marks) {
        // System.out.println(i);
        // }
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Arrays values are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int x = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                System.out.println("Index is : " + i);
        }
    }
}
