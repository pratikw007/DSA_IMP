package ArrayList;
//BY Alpha Batch
import java.util.*;
import java.util.ArrayList;

public class Classroom {

    public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<String> list2 = new ArrayList<>();
    ArrayList<Boolean>  list3 = new ArrayList<>();

    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(9);
//
//    list.add(1,8); //O(n)
//        System.out.println(list);

//    add operation
    System.out.println(list);//O(1)


//    Get Operation
    int element = list.get(3);// list.get(index);
        System.out.println(element);
//Delete
//        list.remove(index);
        list.remove(1);
        System.out.println(list);


//        Set ----> replace
        list.set(2,10); //list.set(index,element we have to replace)  //[1, 3, 10, 9]
        System.out.println(list);

//        Contains Element
        System.out.println(list.contains(1));  //true
        System.out.println(list.contains(99));  /// false
}

}