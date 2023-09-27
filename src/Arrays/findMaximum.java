// package Arrays;

public class findMaximum {

    public static void reverseArray(int arr[],int start,int end){
                 int temp;
                 while(start < end){

                     temp = arr[start];
                     arr[start] = arr[end];
                     arr[end] = temp ;
                     start++;
                     end--;
                 }
    }

    static void printArr(int arr[],int size){
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5,3,6,1,7};
        printArr(arr,5);
        reverseArray(arr,0,4);
        printArr(arr,5);
    }
}

