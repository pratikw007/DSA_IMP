//import java.util.*;
//public class StackC {
//
//    public class Node{  //Node Ban Gayi hai bhai
//        static class Node{
//        int data;
//        Node next;
//        }
//        Node(int data){
//            this.data = data;
//            this.next = null;
//        }
//    }
//
//
//    static class Stack {
//        static Node head = null; // head ko Null baaya gya hai pahle
//
//        public static boolean isEmpty(){
//            return head == null; //head = null =>true
//        }
//
//
////        push
//        public static void push(int data){
////            Node newNode = new Node(data); //ERROR
//            if (isEmpty()){
////                head = newNode;
//                return;
//            }
//
////            newNode.next = head;
////            head = newNode;
//        }
//
//
//        //POP
//        public static  int pop(){
//            if(isEmpty()){
//                return -1;
//            }
//            int top = head.data;
//            head = head.next;
//            return top;
//        }
//
//        public static int peek() {
//            if (isEmpty()){
//                return -1;
//            }
//            return head.data;
//        }
//    }
//
//
//
//
//    public static void main(String[] args) {
//        Stack s = new Stack();
//        s.push(1);
//        s.push(2);
//        s.push(3);
//
//    }
//}
