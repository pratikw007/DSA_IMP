package STACK;
import java.util.*;
import static STACK.StackC.Stack.isEmpty;

public class StackC {
    //Implementation of stack using LinkedList

    static class Node{  //NODE CLASS
    int data;
    Node next;
    Node(int data){   // Constructor
        this.data = data;
        this.next = null;
         }
      }
      static class Stack{
            static Node head = null;

             static boolean isEmpty(){
                return head == null;
            }
//            Push
          public static void push(int data){
                Node newNode = new Node(data);
            if (isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
          }

//          PoP Operation
          public static int pop(){
                if (isEmpty()){
                    return -1;
                }
                int top = head.data;
                head = head.next;
                return top;
          }
//PEEK
          public static int peek(){
                if (isEmpty()){
                    return -1;
                }
                return head.data;
          }
    }
    public static void main(String args[]){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
}
