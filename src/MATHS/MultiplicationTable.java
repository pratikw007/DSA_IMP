package MATHS;
import java.util.Scanner;

public class MultiplicationTable {

    // method to print the table
    public static void
    printMultiplicationTable(int number){
        for(int i=1; i<=10; i++)
            System.out.println(number+
                    " * "+i+" = "+ number * i);
    }

    public static void main(String[] args) {

        // declare a variable to store number
        int number;

        // Create Scanner class object to
        // read the entered number
        Scanner scan = new Scanner(System.in);

        // read input
        System.out.print("Enter integer number::");
        number = scan.nextInt();

        // display multiplication table
        System.out.println("Multiplication"+
                " table of "+number+" is :: ");
        printMultiplicationTable(number);

        // close Scanner class object
        scan.close();
    }
}