package homeWork;

import java.util.Scanner;

/* a Java program to swap two variables*/
public class Program_15_SwapTheValue {
    public static void main(String[] args) {
        // scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first variable value :");
        int first = scanner.nextInt();
        System.out.println("Enter the second variable value:");
        int second  = scanner.nextInt();

    }

    // Swapping the value of variables
    public void swapTheValue (int a,int b){
        int c;
        System.out.println("Before the swapping , The values of first variabel is :"+a+"and second variabel is :"+b);
        c=a;
        a=b;
        b=c;
        System.out.println("After the swapping , The values of first variabel is :"+a+"and second variabel is :"+b);
    }
}



