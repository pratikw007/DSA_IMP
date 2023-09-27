package ArrayList;

import java.util.ArrayList;

public class FindMax {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(1);
        list.add(3);
        System.out.println(list);
//         Maximum Element

        int max = Integer.MIN_VALUE;  //  -- Infinity

        for (int i = 0; i < list.size(); i++) {
//            Best Way
//             if (max<list.get(i)){
//                 max = list.get(i);
//             }

            //   or  2nd Way
            max = Math.max(max,list.get(i));
        }
        System.out.println("max element = " + max);


    }
}
