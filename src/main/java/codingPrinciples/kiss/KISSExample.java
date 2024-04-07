package codingPrinciples.kiss;

import java.util.Scanner;

/**
 * Main class to demonstrate KISS (Keep It Simple and Stupid)
 * Explanation:
 * •	In this example, we have a simple calculator program that performs basic arithmetic operations: addition, subtraction, multiplication, and division.
 * •	The Calculator class contains static methods for performing each arithmetic operation. Each method is straightforward and implements the respective operation without unnecessary complexity.
 * •	The main method in the KISSExample class takes user input for two numbers and the desired arithmetic operation.
 * •	Based on the user's input, the program invokes the corresponding method from the Calculator class to perform the operation and display the result.
 * •	This program demonstrates the KISS principle by providing a simple and straightforward solution to the problem of performing basic arithmetic operations without introducing unnecessary complexity or features. The code is easy to understand and maintain, aligning with the KISS principle.
 * */
public class KISSExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();

        System.out.println("Enter operation (+, -, *, /):");
        char operation = scanner.next().charAt(0);

        double result;
        switch (operation) {
            case '+':
                result = Calculator.add(num1, num2);
                break;
            case '-':
                result = Calculator.subtract(num1, num2);
                break;
            case '*':
                result = Calculator.multiply(num1, num2);
                break;
            case '/':
                result = Calculator.divide(num1, num2);
                break;
            default:
                System.out.println("Invalid operation");
                return;
        }

        System.out.println("Result: " + result);
    }
}

