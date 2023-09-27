package Strings;
import java.util.*;
public class Practice {

    public static void main(String[] args) {
//        String str = "ghrce";
//        String str1 = "GHRCE";
//        String str2 = "COCA";
//
//        System.out.println(str.equals(str1)+" "+str.equals(str2));

//        String str = "ApnaCollege" .replace("l","");
//        System.out.println(str);

//        String str = new String("Hello");
//        String str2  = "Hello";
//
//        System.out.println(str == str2);




                String str1 = "Race";
                String str2 = "Care";

                str1 = str1.toLowerCase();
                str2 = str2.toLowerCase();

                // check if length is same
                if(str1.length() == str2.length()) {

                    // convert strings to char array
                    char[] charArray1 = str1.toCharArray();
                    char[] charArray2 = str2.toCharArray();

                    System.out.println(charArray1);

                    // sort the char array
                    Arrays.sort(charArray1);
                    Arrays.sort(charArray2);

                    // if sorted char arrays are same
                    // then the string is anagram
                    boolean result = Arrays.equals(charArray1, charArray2);

                    if(result) {
                        System.out.println(str1 + " and " + str2 + " are anagram.");
                    }
                    else {
                        System.out.println(str1 + " and " + str2 + " are not anagram.");
                    }
                }
                else {
                    System.out.println(str1 + " and " + str2 + " are not anagram.");
                }
            }
        }
