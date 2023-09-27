package Linked_List_2;

import java.util.LinkedList;

public class LL_Java_Collection {

    public static void main(String[] args) {
//        Create ---> We can Store Only Object ----> Not used int ,float,boolean --> Integer,Float, Charecter
        LinkedList<Integer>  LL = new LinkedList<>();

//        add
        LL.addLast(1);
        LL.addLast(2);
        LL.addFirst(0);

//        0->1->2
        System.out.println(LL);
        //Remove
        LL.removeLast();
        LL.removeFirst(); //1
        System.out.println(LL);

    }
}
