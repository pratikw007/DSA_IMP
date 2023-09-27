package HEAP;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Heaps {
    public static void main(String[] args) {
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
        //If I want to print in reverse Ordered then Used Comparator Operator
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
//        Output is 10

        pq.add(3);   //O(logn)
        pq.add(6);
        pq.add(4);
        pq.add(10);

        while (!pq.isEmpty()) {
            System.out.println(pq.peek()); //O(1)  Output is  : 3 4 6 10
        }
    }
}
