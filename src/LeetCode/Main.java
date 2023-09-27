package LeetCode;
import java.util.*;

    public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input strings
            String stringSent = scanner.nextLine();
            String stringRec = scanner.nextLine();

            // Find and print the missing character
            System.out.println(findMissingCharacter(stringSent, stringRec));

        }

        public static char findMissingCharacter(String stringSent, String stringRec) {
            // Initialize variables to store the sum of ASCII values of characters in both strings
            int sentSum = 0;
            int recSum = 0;

            // Calculate the sum of ASCII values for characters in stringSent
            for (int i = 0; i < stringSent.length(); i++) {
                sentSum += (int) stringSent.charAt(i);
            }

            // Calculate the sum of ASCII values for characters in stringRec
            for (int i = 0; i < stringRec.length(); i++) {
                recSum += (int) stringRec.charAt(i);
            }

            // The missing character's ASCII value is the difference between the two sums
            int answer = sentSum - recSum;

            // Convert the ASCII value back to the character
            char A = (char) answer;

            return A;
        }
    }
