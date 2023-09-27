package Sorting;
//https://www.geeksforgeeks.org/bubble-sort/
public class Bubble{
    static void bubSort(int arr[],int n){
         int temp;
         for (int i = 0; i < n-1; i++) {
             for (int j = 0; j < n-i-1; j++) {

                 if (arr[j] >arr[j+1]){
                     temp = arr[j];
                     arr[j] = arr[j+1];
                     arr[j+1] = temp;
                 }
             }
         }
     }
     static void printArr(int arr[],int size){
         for (int i = 0; i < size ; i++) {
             System.out.print(arr[i]+" ");
         }
         System.out.println();
     }

    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        int n  = arr.length;
        bubSort(arr,n);
        System.out.println("Sorted Array:  ");
        printArr(arr,n);
    }
}
