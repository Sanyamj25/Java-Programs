// import java.util.*;
public class Lecture16 {
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        //sorting algorithm
        //Bubble sort
        // int arr [] = {7,8,3,2,1};
        // for (int i = 0; i < arr.length-1; i++) {
        //     for (int j = 0; j < arr.length-i-1; j++) {
        //         if(arr[j] > arr[j+1]){
        //             //swap
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }
        // printArray(arr);
        
        //Selection sort
        // int arr [] = {7,8,3,2,1};
        // for (int i = 0; i < arr.length-1; i++) {
        //     int small = i;
        //     for (int j = i+1; j < arr.length; j++) {
        //         if(arr[small] > arr[j]){
        //           small = j;  
        //         }
        //         int temp = arr[small];
        //             arr[small] = arr[i];
        //             arr[i] = temp;
        //     }
        // }
        // printArray(arr);

        //Insertion sort
        int arr [] = {7,8,3,2,1};
        
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            int j = i-1;
            while(j >= 0 && curr <arr[j]) {
            arr[j+1] = arr[j];
            j--;
            }
            arr[j+1] = curr;
        }
        printArray(arr);

    }
}
