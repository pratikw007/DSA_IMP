package Strings;

public class MergeStringAlternately {

    public static  String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int n1 =  word1.length();//3
        int n2 =  word2.length();//3

        int i = 0;
        while(i < n1 || i < n2){

            if(i<n1)
                sb.append(word1.charAt(i));
            //   for i = 0 append 0th index a in word1
            if(i<n2)
                sb.append(word2.charAt(i));
            //   for i = 0 append 0th index a in word2
            i++;
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(mergeAlternately(word1,word2));

    }
}
