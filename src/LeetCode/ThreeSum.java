package LeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a[] = new int[n];

            for (int i = 0; i <= n; i++) {
                a[i] = sc.nextInt();
            }
            ThreeSum g = new ThreeSum();
//            if (g.findTriplet(a,n)){
//                System.out.println("1");
//            }else {
//                System.out.println("0");
//            }
        }
    }

    public boolean findTriplet(int arr[],int n,int i){
        Arrays.sort(arr);
        int j = arr.length-1;
        for (i = 0; i < n-2; i++) { //becaause the n = k , n-1 = j
            if (twoSum(arr,-arr[i],i+1)){
                return true;
            }
        }
        return false;
    }
    public boolean twoSum(int[] a, int x, int i){
         i = 0;
        int j = a.length-1;

        while(i<j){
            if (a[i]+a[j] > x){
                j++;
            } else if (a[i]+a[j] < x){
                i++;
            }else { // a[i] = a[j]
                return true;
            }
        }
        return false;
    }
}
