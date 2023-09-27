package Stack_And_Queue_KK;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class InbuildQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();//Queue Class Not Availabale
        queue.add(3);
        queue.add(6);
        queue.add(5);
        queue.add(19);
        queue.add(1);

        System.out.println(queue.peek());
        System.out.println(queue.remove());

    }
}
