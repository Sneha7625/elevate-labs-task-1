import java.util.*;  // Importing the Scanner class for user input

/**
 * A simple console-based Calculator in Java
 * Supports addition, subtraction, multiplication, and division
 */
public class Calculator 
{

    // Method to perform addition
    public static double add(double a, double b) 
    {
        return a + b;
    }

    // Method to perform subtraction
    public static double subtract(double a, double b) 
    {
        return a - b;
    }

    // Method to perform multiplication
    public static double multiply(double a, double b) 
    {
        return a * b;
    }

    // Method to perform division with zero-check
    public static double divide(double a, double b) 
    {
        if (b != 0) 
        {
            return a / b;
        } 
        else 
        {
            System.out.println("Error: Division by zero.");  // Error handling
            return Double.NaN;  // Not a Number
        }
    }

    // Main method: program entry point
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);  // Scanner for user input
        boolean run = true;  // Control variable for loop

        System.out.println("\n ===== Java Console Calculator =====");

        while (run) 
        {
            // Display menu
            System.out.println("\nChoose an operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            int choice = scanner.nextInt();  // Read user's menu choice

            // Exit condition
            if (choice == 5) 
            {
                run = false;
                System.out.println("Exiting Calculator... Thanks for chosing us!! \nGoodbye :)");
                break;
            }

            // Get input numbers from user
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = 0;  // Variable to hold the result

            // Perform operation based on choice
            switch (choice) 
            {
                case 1:
                    result = add(num1, num2);
                    break;
                case 2:
                    result = subtract(num1, num2);
                    break;
                case 3:
                    result = multiply(num1, num2);
                    break;
                case 4:
                    result = divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid choice. Please select from 1 to 5.");
                    continue;
            }

            // Display result
            System.out.println("Result: " + result);
        }
        scanner.close();  // Close the scanner resource
    }
}
