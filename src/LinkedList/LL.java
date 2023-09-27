package LinkedList;
import java.util.*;
public class LL {
    private Node head;
    private Node tail;


    private int size;  //size of LL

    public LL(){ //constructor of LL class
         this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null){  //1st item being added
            tail = head;
        }
        size++;
    }

    public void insertLast(int val){
        if (tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val); //created Nodes
        tail.next = node;
        tail = node;
        size++;
    }


    public int deleteLast(){
        if (size <= 1){
                return deleteFirst();

        }
        Node secondLast =  get(size - 2);
        int val = tail.value;
       tail = secondLast;
       tail.next = null;
        return val;
    }
    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if (head == null){
            tail = null;
        }
        size--;
        return val;
    }

    public void display(){
         Node temp = head;
         while(temp != null){
             System.out.print (temp.value + " -> ");
             temp = temp.next;
         }
        System.out.println("END");
    }
//insert a value at perticular index
    public void insert(int val,int index){
       if (index == 0){
           insertFirst(val);
           return;
       }
       if(index == size){
           insertLast(val);
           return;
       }

       Node temp = head;  //node is at 0th position
//       if the index is 3 Go till 2
        for (int i = 1; i < index ; i++) {
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);//temp.next =current.next
        temp.next = node;
        size++;
    }

   private class Node{
       private int value;
       private Node  next;

      public Node(int value){  //Constructor of Node classs
       this.value = value;
      }

      public Node(int value,Node next){   //Constructor of Node classs
          this.value = value;
          this.next = next;
      }
}
}
