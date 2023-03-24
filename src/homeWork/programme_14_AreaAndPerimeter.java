package homeWork;
/*Write a Java program to print the area and perimeter of a rectangle. Test Data:
       * Width = 5.5 Height = 8.5
       * Expected Output:
       * Area is 5.6 * 8.5 = 47.60
       * Perimeter is 2 * (5.6 + 8.5) = 28.208 */

import java.util.Scanner;

public class programme_14_AreaAndPerimeter {
    // calculating area and perimeter of rectangle
    public static void areaAndPerimeterofRectanle(int height, int width) {
        int perimeter = 2 * (height + width);
        int area = (height * width);
        System.out.println("the area of the rectangle is :" + area);
        System.out.println(("The perimeter of the rectangle is :" + perimeter));
    }

    public static void main(String[] args) {
        //scanner declartion for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the width of the rectangle:");
        int height = scanner.nextInt();
        System.out.print("Enter the height of the rectangle:");
        int width = scanner.nextInt();
        areaAndPerimeterofRectanle(height,width);
        //closing the scanner object
        scanner.close();
    }
    }
