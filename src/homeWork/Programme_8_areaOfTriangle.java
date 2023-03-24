package homeWork;
/*Write a program to calculate the area of a triangle*/
import java.util.Scanner;


public class Programme_8_areaOfTriangle {
    public static void main(String[] args) {


        // Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the lenght of the triangle:");
        int length = scanner.nextInt();
        System.out.println("please enter the height of the triangle:");
        int hight = scanner.nextInt();
        areaOfTriangle(hight, length);
        //closing the scanner object
        scanner.close();
    }

    //calculating the area of triangle with no retur  type with parameter method
    public static void areaOfTriangle(int lenght, int height){
        int area = (lenght * height) / 2;
        System.out.println("The Area of a triangle is :" + area);
    }
    }

