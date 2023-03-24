package homeWork;
/*Write a Java program that takes a number as input and prints its  multiplication table up to 10.
 *   Test Data: Input a number: 8
 *  Expected Output :
 * 8 x 1 = 8
 *8 x 2 = 16
 *8 x 3 = 24 */

import java.util.Scanner;

public class Programme_10_MultiplicationTabel {
    public static void main(String[] args) {
        // Scanner declartion for reading input from console
        Scanner scanner = new Scanner (System.in);
        System.out.println("please enter the number:");
        int number = scanner.nextInt();
        multiplicationTableof(number);
        //closing the scanner object
        scanner.close();
    }
    // Printing the multiplication tabel of entered number
    public static void multiplicationTableof(int number){
        System.out.println(number+"x"+1+"="+(number));
        System.out.println(number+"x"+1+"="+(number * 2));
        System.out.println(number+"x"+1+"="+(number * 3));
        System.out.println(number+"x"+1+"="+(number * 4));
        System.out.println(number+"x"+1+"="+(number * 5));
        System.out.println(number+"x"+1+"="+(number * 6));
        System.out.println(number+"x"+1+"="+(number * 7));
        System.out.println(number+"x"+1+"="+(number * 8));
        System.out.println(number+"x"+1+"="+(number * 9));
        System.out.println(number+"x"+1+"="+(number * 10));







    }




}
