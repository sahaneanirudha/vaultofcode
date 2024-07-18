// Task 2:- write a program that checks if a given word is palindrome or not


import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a word
        System.out.println("Enter a word:");
        String word = scanner.nextLine();

        // Check if the word is a palindrome
        boolean isPalindrome = isPalindrome(word);

        // Print the result
        if (isPalindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to check if a given word is a palindrome
    public static boolean isPalindrome(String word) {
        // Convert the word to lowercase to ensure case-insensitive comparison
        word = word.toLowerCase();

        // Initialize pointers for the start and end of the word
        int left = 0;
        int right = word.length() - 1;

        // Compare characters from the start and end moving towards the center
        while (left < right) {
            // If characters do not match, it's not a palindrome
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            // Move the pointers towards the center
            left++;
            right--;
        }

        // If all characters match, it's a palindrome
        return true;
    }
}
