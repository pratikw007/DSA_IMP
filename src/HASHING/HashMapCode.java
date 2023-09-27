package HASHING;
//implementation Of HashMap
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class HashMapCode {
      static class HashMap<K,V>{ // Generic
          private class Node{
            K key;
            V value;

            public Node(K key,V Value){
              this.key = key;
              this.value = value;
            }
          }
           private int n; // n
          private int N;
          private LinkedList<Node> buckets[]; //N  = buckets.length  -----> Data Stored in LinkedList

          @SuppressWarnings("unchecked")
          public HashMap(){
//              this.n = 4;
              this.N = 4;
              this.buckets = new LinkedList[4]; //bucket size =4
              for (int i = 0; i < 4; i++) {
                  this.buckets[i] = new LinkedList<>(); //Create Buckets
              }
          }

          private int hashFunction(K key){
            int hc = key.hashCode(); // Some value return HASHCODE(Encrypted)
//              eg. ==> 1239494 or -2939333 --> convert into positive
           return Math.abs(hc) % N; //Gives a value in Between 0 to size -1
          }

          private int SearchInLL(K key,int bi){ // if get the index 2 Search the Nodes in in index2
              LinkedList<Node> ll = buckets[bi];
              int di = 0;

              for (int i = 0; i <ll.size(); i++) {
                  Node node = ll.get(i); //Node ko nikal liya jo chahiye usko
                  if (node.key == key){
                 return di;
                  }
                  di++;
              }
               return -1;
          }
          private void rehash(){
              LinkedList <Node>  oldBuck[] = buckets;
              buckets = new LinkedList[N*2];
              N =  2*N;
              for (int i = 0; i < buckets.length; i++) {
                  buckets[i] = new LinkedList<>();
              }
//              Nodes --> add in buckets
              for (int i = 0; i < oldBuck.length; i++) {
                 LinkedList<Node> ll = oldBuck[i];
                  for (int j = 0; j < ll.size(); j++) {
                            Node node = ll.remove();
                            put(node.key, node.value);
                  }
              }
          }
          public void put(K key,V value){ // 0(1)
              int bi = hashFunction(key); // Bracket Index --value--> 0 to size -1; // 0 to 3
              int di = SearchInLL(key,bi);  // Data index -->if valid else -1

              if (di != -1){ //if the data index is valid value
                  Node node =  buckets[bi].get(di);
                  node.value = value;
              }else{
                  buckets[bi].add(new Node(key,value));
                  n++;
              }
              double lamda = (double) n/N;
//              ReHashing
              if (lamda > 2.0){
                 rehash();
              }
          }

          public boolean containsKey(K key){
              int bi = hashFunction(key); // Bracket Index --value--> 0 to size -1; // 0 to 3
              int di = SearchInLL(key,bi);  // Data index -->if valid else -1

              if (di != -1){ //if the data index is valid value
                  return true;
              }else{
                    return false;
              }
          }

          public V remove(K key){
              int bi = hashFunction(key); // Bracket Index --value--> 0 to size -1; // 0 to 3
              int di = SearchInLL(key,bi);  // Data index -->if valid else -1

              if (di != -1){ //if the data index is valid value
                  Node node =  buckets[bi].get(di);
                  n--;
                  return node.value;
              }else{
                 return null;
              }

          }
          public V get(K key){
              int bi = hashFunction(key); // Bracket Index --value--> 0 to size -1; // 0 to 3
              int di = SearchInLL(key,bi);  // Data index -->if valid else -1

              if (di != -1){ //if the data index is valid value
                  Node node =  buckets[bi].get(di);
                  return node.value;
              }else{
                  return null;
              }
          }
          public ArrayList<K> keySet(){
              ArrayList<K> keys = new ArrayList<>();

              for (int i = 0; i < buckets.length; i++) {
                  LinkedList<Node> ll = buckets[i];
                  for (Node node:ll) {
                      keys.add(node.key);
                  }
              }
              return keys;
          }

          public boolean isEmpty(){
              return n == 0;
          }
                     }


    public static void main(String[] args) {
   HashMap<String,Integer> hm = new HashMap<>();
   hm.put("India",100);
   hm.put("China",150);
   hm.put("Us",50);
   hm.put("Nepal",20);

        ArrayList<String> keys = hm.keySet();
        for (String key: keys) {
            System.out.println(key);
        }
        System.out.println(hm.get("India"));
//        System.out.println(hm.remove("remove"));
      }
}
