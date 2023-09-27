package Array_Practice_GFG;

public class ReverseArray {

    public static void ReverseArray(int arr[],int start,int end){
        int temp;
        while(start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

//    To Display the Element on the Console
    public static void PrintArr(int arr[],int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ "");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
//        System.out.println(ReverseArray(arr,0,5);
        PrintArr(arr,6);
        ReverseArray(arr,0,5);
        System.out.print("Reverse Array is"+" ");
        PrintArr(arr,6);
    }
}
