//package LinkedList;
//import java.util.LinkedList;
//public class SizeOfLL {
//        public static class Node {
//            int data;
//            LinkedList.Classroom.Node next;
//            public Node(int data) {
//                this.data = data;
//                this.next = null;
//            }
//        }
//        public static LinkedList.Classroom.Node head; //Create One Node
//        public static LinkedList.Classroom.Node tail; // Create One Tail
//        public void addFirst(int data) {
//            //                Step 1 : Create New Node
//            LinkedList.Classroom.Node newNode = new LinkedList.Classroom.Node(data);
////             size++;
//            if (head == null) {
//                head = tail = newNode;
//                return;
//            }
//
////          Step2 :- newNode next = head
//            newNode.next = head; //Link to the head node
////    Step 3: head = newNode
//            head = newNode;
//        }
//
//        public void addLast(int data) {
////    step1: Create New Node
//            LinkedList.Classroom.Node newNode = new LinkedList.Classroom.Node(data);
//            if (head == null) {
//                head = tail = newNode;
//                return;
//            }
////    step 2: next.newNode pointing to the tail.next
//            tail.next = newNode;
//
////    step 3: update the tail
//            tail = newNode;
//        }
//
//        public void print() {
//
//            if (head == null) {
//                System.out.println("LL is Empty");
//                return;
//            }
//            LinkedList.Classroom.Node temp = head;
//            while (temp != null) {
//                System.out.print(temp.data + "->");
//                temp = temp.next;
//            }
//            System.out.println("Null");
//        }
//
//        public static void main(String[] args) {
//            LinkedList ll = new LinkedList();
//            ll.addFirst(3);
//            ll.addFirst(5);
//
//            ll.addLast(6);
//            ll.addLast(8);
//
//
//
//        }
//    }
//
