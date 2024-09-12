//  Create a calculator program that takes two numbers and takes an operation and applies it to the two numbers. 

// num1 
// num2 
// operators 
// 1 (Addition)
// 2 (Subtraction) 
// 3 (Multiplication) 
// 4 (Division) 

// Use if else statements to decide which operator to use. 
// Print out the answer to the terminal.

// Calculator code goes here:

import java.util.Scanner;

public class calc {
    public static void main(String[] args) {

        //Set up variables
        Scanner console = new Scanner(System.in);
        double num1; 
        double num2;
        int operator;
        
        // Prompt user to enter two numbers
        System.out.print("Enter the first number: ");
        num1 = console.nextDouble(); // Assign a possible decimal number to num1

        System.out.print("Enter the second number: ");
        num2 = console.nextDouble(); // Assign a possible decimal number to num1

        // Display operator options
        System.out.println("Choose an operation:");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");

        // Get the user's choice of operation
        System.out.print("Enter the number of the operation: ");
        operator = console.nextInt();

        // Perform the operation based on the user's choice
        if (operator == 1) {
            System.out.println("Result: " + (num1 + num2));
        } else if (operator == 2) {
            System.out.println("Result: " + (num1 - num2));
        } else if (operator == 3) {
            System.out.println("Result: " + (num1 * num2));
        } else if (operator == 4) {
            if (num2 != 0) {
                System.out.println("Result: " + (num1 / num2));
            } else {
                System.out.println("Error: Cannot divide by zero.");
            }
        } else {
            System.out.println("Invalid operator choice.");
        }

        console.close(); // Close the console

    }
}
