public class Lecture22 {
    public static void printN(int arr[],int size){
    for (int i = 0; i < size; i++) {
    System.out.print(arr[i]+" ");
    }
    }
    public static void MergeSort(int arr[], int sta, int mid, int end) {
        int newArr[] = new int[end - sta + 1];
        int idx1 = sta;
        int idx2 = mid+1;
        int x = 0;
        while (idx1 <= mid && idx2 <= end) {
            if (arr[idx1] <= arr[idx2]) {
                newArr[x++] = arr[idx1++];
            } else {
                newArr[x++] = arr[idx2++];
            }
            
        }
        while (idx1 <= mid) {
            newArr[x++] = arr[idx1++];
        }
        while (idx2 <= end) {
            newArr[x++] = arr[idx2++];
        }
        for (int i = 0, j = sta; i < newArr.length; i++, j++) {
            arr[j] = newArr[i];
        }

    }

    public static void Merge(int arr[], int sta, int end) {
        if (sta >= end) {
            return;
        }
        int mid = sta + (end-sta) / 2;
        Merge(arr, sta, mid);
        Merge(arr, mid + 1, end);
        MergeSort(arr, sta, mid, end);
    }

    public static void main(String[] args) {
        // Merge sort-Divide and conquer rule
        int arr[] = { 2, 9, 4, 7, 3, 5 };
        int size = arr.length;
        Merge(arr, 0, size - 1);
        printN(arr,size);
        
    }
}
