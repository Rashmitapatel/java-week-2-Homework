package homeWork;

import java.util.Scanner;

/*Write a program to enter any radius value of the circle and find out the  area.
(Formula of Area A=PI*r*r).
 */
public class Progrrame_6_AreaOfcircle {

    public static void main(String[] args) {
        // scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        areaOfcircle(radius);
        // closing the scanner object
        scanner.close();

    }

    // Calculating the area of circle
    public static void areaOfcircle(double radius) {
        double pi = Math.PI ;
        double area = (pi * radius * radius);
        System.out.println(("The Area of circel is:" + area));
    }
}



