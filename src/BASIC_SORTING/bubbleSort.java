package BASIC_SORTING;

public class bubbleSort {
    public static void Bubble(int arr[],int n){
//        turns
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                     arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void PrintArr(int arr[],int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {4,5,1,3,2};
        int n = arr.length;
        System.out.println("Input Array:- ");
        PrintArr(arr,5);
         Bubble(arr,5);
        System.out.println("Outpur Array");
        PrintArr(arr,5);
    }
}
