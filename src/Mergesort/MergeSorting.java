package Mergesort;

public class MergeSorting {

//    Print Array
    public static void PrintArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void MergeSort(int arr[],int si,int ei){
//        mid
        int mid = si + (ei - si)/2;
         //Base Case
        if(si>ei){
            return;
        }

         MergeSort(arr,si,ei); //left
         MergeSort(arr,mid+1,ei); //Right
         merge(arr,si,ei,mid);
    }

//    Merge step
    public static void merge(int arr[],int si,int ei,int mid) {
        //Create Temp Array
//        Left(0,3)=4 Right(4,6)=3
//        6-0+1 = 7
        int temp[] = new int[ei - si + 1];

        int i = si; //Iterate the Left Side Of Array
        int j = mid + 1; //iterator for Right Side Of an array
        int k = 0; //iterate for temp array after Merge

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                // Left Right
                temp[k] = arr[i]; //if R is Smaller than Add into temp arr
                i++;
                k++;
            } else {
                temp[k] = arr[j];
                j++;
                k++;
            }
        }
//        Left Part
            while (i <= mid) {
                temp[k++] = arr[i++];
            }
            // Right Part
            while (j <= ei) {
                temp[k] = arr[j];
                k++;
                j++;
            }

//            convert the temp array into original
            for (k = 0, i = si; k < temp.length; k++, i++) {
                arr[i] = temp[k];
            }
    }

    public static void main(String[] args) {
        int arr[] = {4,5,7,2,8,9};
        MergeSort(arr,0,5);
        PrintArr(arr);
    }

}
