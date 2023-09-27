package MATHS;

import java.util.Scanner;

public class FUNNYOCCARANCE {

    static String removeChar(String str, char ch){
     int len = str.length();
     String s = "";
        for (int i = 0; i < len; i++) {
            char c  = str.charAt(i);
            if (c == ch){
                continue;
            }else {
                s = s+c;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          String str = "";
          char ch = 0;
        char c = sc.next().charAt(ch);
//        removeChar(str,ch);
        System.out.println(removeChar(str,ch));
    }
}
