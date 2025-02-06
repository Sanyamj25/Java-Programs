public class Lecture23 {
    public static int partition(int arr[],int low,int high){
        int pivot = arr[high];
        int i = low-1;
        for (int j = low; j < high; j++) {
            if(arr[j]<pivot){
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
        
    }
    public static void Quick(int arr[],int low,int high){
        if(low<high){
            int pivot = partition(arr,low,high);  
            Quick(arr, low, pivot-1);
            Quick(arr, pivot+1, high);
        }
        
    }
    public static void main(String[] args) {
        //Quick sort - Pivot & Partition
        int arr[] = {6,3,9,5,2,8};
        int size = arr.length;
        int low = 0;
        Quick(arr,low,size-1);
        //Sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
