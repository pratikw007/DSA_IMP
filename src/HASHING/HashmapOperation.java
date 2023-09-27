package HASHING;
import java.util.*;

public class HashmapOperation {
    public static void main(String[] args) {
//        CREATE
        HashMap<String,Integer> hm = new HashMap<>();


//        Insert O(1)
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);
        System.out.println(hm); //  {China=150, US=50, India=100}

//        Get - O(1)
       int population =  hm.get("India");
        System.out.println(population);//100

        System.out.println(hm.get("Buthan")); //null

//        ContainsKey
        System.out.println(hm.containsKey("India")); //true - Check Whether the Key Exist or not.
        System.out.println(hm.containsKey("Butan")); //false -Check Whether the Key Exist or not.

//Remove - O(1)
        System.out.println(hm.remove("China")); //Remove China And Print the Value Of China
        System.out.println(hm); //{US=50, India=100}

//        Size
        System.out.println(hm.size());

//        isEmpty
        System.out.println(hm.isEmpty()); //false
        hm.clear();
        System.out.println(hm.isEmpty()); //True

    }
}
