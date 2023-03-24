package homeWork;

import java.util.Scanner;

/**
 * Write a Java programme to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog.
 */
public class Programme_18_PrintOperation {
    public static void main(String[] args) {


        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter second number");
        int secondNumber = scanner.nextInt();
        Programme_18_PrintOperation printOperation = new Programme_18_PrintOperation();
        printOperation.printTheoperation(firstNumber,secondNumber);

         //Closing the scanner object
        scanner.close();
    }
    // Printing the all operations
    public static void printTheoperation(int a, int b) {
        System.out.println("The sum of" +a+ "and" + b + "is"+ (a+b));
        System.out.println("The differance of "+ a +"and"+ b +"is"+ (a*b));
        System.out.println("The product of "+ a +"and"+ b +"is"+ (a/b));
        System.out.println("The division of "+ a +"and"+ b +"is"+ (a%b));

    }


}