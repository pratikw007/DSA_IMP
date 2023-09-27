package MATHS;
import java.util.Scanner;
public class Even {

    public static boolean isEven(int n){
        if(n%2==0) return true;
        return false;
    }

    public static void main(String[] args) {
         int minRange = 0;
        int maxRange  = 0;

        boolean result  = false;

        // create Scanner class object to take input
        Scanner scan = new Scanner(System.in);

        // read number from end-user
        System.out.print("Enter min range:: ");
        minRange = scan.nextInt();
        System.out.print("Enter max range:: ");
        maxRange = scan.nextInt();

        System.out.println("Even numbers are: ");
        for (int i = minRange; i <= maxRange; i++) {
            result = isEven(i);
            if (result){
                System.out.print(i+" ");
            }
        }
        scan.close();
    }
}
