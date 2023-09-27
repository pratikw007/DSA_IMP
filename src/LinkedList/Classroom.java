package LinkedList;

import java.util.*;
public class Classroom {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //  as a property Because we have only one head and one tail
    public static Node head; //Create One Node
    public static Node tail; // Create One Tail

    //    To Add The First() element in Node
    public void addFirst(int data) {
        //                Step 1 : Create New Node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

//          Step2 :- newNode next = head
        newNode.next = head; //Link to the head node
//    Step 3: head = newNode
        head = newNode;
    }

    public void addLast(int data) {
//    step1: Create New Node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
//    step 2: next.newNode pointing to the tail.next
        tail.next = newNode;

//    step 3: update the tail
        tail = newNode;
    }

    public void print() { //to print the LL Elemrnt --> O(N)
//    if the LinkedList is Null
//
//        if (head == null) {
//            System.out.println("LL is Empty");
//            return;
//        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
            LinkedList ll = new LinkedList(); // LL Object

//        ye kam main mai nhi karna hai methods bana sakte hai
//            ll.head = new Node(1); //Create 1 st Node
//            ll.head.next = new Node(2); // Create 2nd Node Which is pointing to the third Node
        ll.addFirst(3);
        ll.addFirst(5);

        ll.addLast(6);
        ll.addLast(8);

//        ll.print();

    }
}