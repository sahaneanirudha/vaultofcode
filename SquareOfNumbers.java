// Task 3:-create a list of number then write a program  that prints the square of each number in the list 

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SquareOfNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        // Create a list to store the numbers
        List<Integer> numbers = new ArrayList<>();

        // Prompt the user to enter numbers
        System.out.println("Enter numbers (type 'done' to finish):");

        // Read numbers from the user until 'done' is entered
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("done")) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a number or 'done' to finish.");
                }
            }
        }

        // Print the square of each number in the list
        System.out.println("Squares of the numbers:");
        for (int number : numbers) {
            System.out.println(number + " squared is " + (number * number));
        }

        // Close the scanner
        scanner.close();
    }
}
