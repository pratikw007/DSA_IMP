package LinkedList;

import java.util.LinkedList;

public class SearchLL {
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


    public int itrSearch(int key){
        Node temp = head;
        int i = 0;

        while(temp != null){
            if (temp.data == key){
                return  i; //key is found
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    public void print() {
        if (head == null) {
            System.out.println("LL is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList(); // LL Object
        ll.addFirst(3);
        ll.addFirst(5);

        ll.addLast(6);
        ll.addLast(8);
        System.out.println();
            }

}