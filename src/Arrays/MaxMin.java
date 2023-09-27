// package Arrays;
import java.util.Arrays;
class Pair {
    public int min;
    public int max;
}
public class MaxMin {
    static Pair getMinMax(int arr[],int n){
        Pair minmax = new Pair();
        Arrays.sort(arr);
        minmax.min = arr[0]; //first Element
        minmax.max = arr[n-1]; //last element

        return minmax;
    }

    public static void main(String[] args) {
        int arr[] = { 1000, 11, 445, 1, 330, 3000 };
        int n = arr.length;
        Pair minmax = getMinMax(arr, n);
        System.out.println("Minimum element is " + minmax.min);
        System.out.println("Maximum element is " + minmax.max);
    }
}
