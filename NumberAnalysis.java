// Program to print Biggest of 3 Numbers if the numbers are not equal 
// and also print whether the numbers are positive or negative or mixed numbers.

import java.util.Scanner;
public class NumberAnalysis{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = in.nextInt();
        System.out.print("Enter second number: ");
        int b = in.nextInt();
        System.out.print("Enter third number: ");
        int c = in.nextInt();
        int greatestNumber = a;
        if ((a == b) && (b == c))
        { 
            System.out.println("Entered numbers are equal.");
        }
        else {
            if (b >greatestNumber){
                greatestNumber = b;
                }
            if (c >greatestNumber) {
                greatestNumber = c; }
            System.out.println("The greatest number is " + greatestNumber);
            if ((a >= 0) && (b >= 0) && (c >= 0)) { 
                System.out.println("Entered numbers are all positive numbers.");
            }
            else if((a < 0) && (b < 0) && (c < 0)) {
                System.out.println("Entered numbers are all negative numbers.");}
            else { 
                System.out.println("Entered numbers are mixed numbers."); 
        }
    }
}
}