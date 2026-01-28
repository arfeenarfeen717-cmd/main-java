package day2;

import java.util.Scanner;  // import goes outside class

public class code5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declare variables for length and width
        double length, width, area;

        // Input length and width from user
        System.out.print("Enter length of rectangle: ");
        length = sc.nextDouble();

        System.out.print("Enter width of rectangle: ");
        width = sc.nextDouble();

        // Calculate area
        area = length * width;

        // Display the result
        System.out.println("Area of the rectangle: " + area);

        sc.close();
    }  // only one closing brace for main
}  // only one closing brace for class

