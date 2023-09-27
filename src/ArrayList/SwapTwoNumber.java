package ArrayList;

import java.util.ArrayList;

public class SwapTwoNumber {



public static void swap(ArrayList<Integer> list,int idx1,int idx2){
     int temp = list.get(idx1);
     //Change the Value using Set  method;
    list.set(idx1,list.get(idx2));
    list.set(idx2,temp);

}

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int idx1 = 1,idx2 =3;


    }
}
