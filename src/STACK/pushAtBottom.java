package STACK;
import java.util.*;
import java.util.Stack;

public class pushAtBottom {

    public static void pushAtBottom(Stack<Integer> s,int data){
        if (s.isEmpty()){
            s.push(data);
            return;
        }
          int top = s.pop(); // POP all the element from the stack up to Bottom --> POP 3,2,1
          pushAtBottom(s,data); //push 4 --> at bottom
          s.push(top);//push the element --> 1,2,3
           // 4-->1-->2-->3
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(s,4);

        while(!s.isEmpty()){
            System.out.println(s.pop());
        }


    }

    public static class StackB {

        static class Stack{
            static ArrayList<Integer> list = new ArrayList<>();

            //isEmpty()
            public static boolean isEmpty(){
                boolean Empty = list.size() == 0; //Element Not Found ==> then return true
                 return Empty;
            }

             //Push operation

            public static void push(int data){
                list.add(data); //top pr add krne ke liye
            }


    //            POP Operation
            public static int pop(){
                //        if arrayList is Empty
                if(isEmpty()){
                    return -1;
                }

                int top = list.get(list.size()-1);
                list.remove(list.size()-1);//last wali value ko nikalta hai
                return  top;
            }
            public static int peek(){
                int top1 = list.get(list.size()-1);
                return top1;
            }

            public static void main(String[] args) {
                Stack s = new Stack();
                s.push(1);
                s.push(2);
                s.push(3);
                s.push(4);


                while(!isEmpty()){  ///fpr printing the pop element the peek operation is used
                    System.out.println(s.peek());
                    s.pop();
                }
            }

        }
    }
}
