package day2;

import java.util.Scanner;  // must be outside the class

public class code6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two integers
        System.out.print("Enter first integer: ");
        int a = sc.nextInt();

        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        // Calculate sum, difference, product
        int sum = a + b;
        int difference = a - b;
        int product = a * b;

        // Calculate quotient safely
        if (b != 0) {
            double quotient = (double) a / b;
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Quotient: Division by zero is not allowed.");
        }

        // Display results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);

        sc.close();
    } // only one closing brace for main
} // onl
