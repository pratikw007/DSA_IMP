package STACK;

//Implementation of stack using Arraylist
import java.util.*;
import java.util.ArrayList;
public class Stack {
    static class StackB {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0; //List Size is zero
        }

        //                PUSH FUNCTION
        public static void push(int data) {
            list.add(data);
        }

        //                POP Function
        public static int pop() {
            int top = list.get(list.size() - 1);
            list.remove(list.size());
            return list.get(list.size());
        }

        //                PEEK Function
        public static int peek() {
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        StackB s = new StackB();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}