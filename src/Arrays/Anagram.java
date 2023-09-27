import java.util.Arrays;
import java.util.Scanner;

// https://www.geeksforgeeks.org/check-whether-two-strings-are-anagram-of-each-other/

public class Anagram {

    static boolean isAnagram(char[] str1, char[] str2)
    {
        // Get lengths of both strings
        int n1 = str1.length;
        int n2 = str2.length;
 
        // If length of both strings is not same,
        // then they cannot be anagram
        if (n1 != n2)
            return false;
 
        // Sort both strings
        Arrays.sort(str1);
        Arrays.sort(str2);
 
        // Compare sorted strings
        for (int i = 0; i < n1; i++)
            if (str1[i] != str2[i])
                return false;
 
        return true;
    }

    public static void main(String[] args) {

        char str1[] = { 'g', 'r', 'a', 'm' };
        char str2[] = { 'a', 'r', 'm' };

             System.out.println(isAnagram(str1, str2));
            }
        }
    

