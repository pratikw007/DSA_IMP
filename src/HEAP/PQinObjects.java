//package HEAP;
//import java.util.PriorityQueue;
//import  java.util.*;
//
//public class PQinObjects {
//    static class Student implements Comparable<Student>{
//        String name;
//        int rank;
//     public Student(String name,int rank){
//         this.name = name;
//         this.rank =rank;
//     }
//
//     @Override
//        public int compareTo(Student s2){
//         return  this.rank - S2.rank;
//     }
//    }
//
//    public static void main(String[] args) {
//    PriorityQueue<Integer> pq = new PriorityQueue<>();
//            pq.add("A", 5);
//            pq.add("B", 3);
//            pq.add("C",1);
//            pq.add("D",4);
//
//            while (!pq.isEmpty()){
//                System.out.println(pq.peek().name +"-->"+pq.peek().rank);
//                pq.remove();
//            }
//    }
//}
//
////Output is
////C --> 1
////B --> 3
////D --> 4
////A --> 5