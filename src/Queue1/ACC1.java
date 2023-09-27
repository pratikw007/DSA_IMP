package Queue1;
import java.util.*;
import java.lang.String;
public class ACC1 {
    static String helper(String s, int n) {
            int sum = 0;
            String ans = "";
            for (int i = 1; i < n; i = i + 2) {
                sum += s.charAt(i) - '0'; // Use charAt() to access characters
                if (sum > n) {
                    ans += s.charAt(i - 1);
                }
            }
            return ans;
        }

    public static void main(String[] args) {
        String s ="aaaabbccddd";
        int n = s.length();
        System.out.println(helper(s,n));
    }
}