//Task 1 :- write the program to count word frequencies in a given text in java

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a text
        System.out.println("Enter a text:");
        String inputText = scanner.nextLine();

        // Split the input text into words
        String[] words = inputText.split("\\s+");

        // Create a HashMap to store word frequencies
        Map<String, Integer> wordFrequencies = new HashMap<>();

        // Iterate through each word in the array
        for (String word : words) {
            // Convert the word to lowercase to ensure case-insensitive counting
            word = word.toLowerCase();

            // If the word is already in the map, increment its frequency
            if (wordFrequencies.containsKey(word)) {
                wordFrequencies.put(word, wordFrequencies.get(word) + 1);
            } else {
                // Otherwise, add the word to the map with a frequency of 1
                wordFrequencies.put(word, 1);
            }
        }

        // Print the word frequencies
        System.out.println("Word Frequencies:");
        for (Map.Entry<String, Integer> entry : wordFrequencies.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Close the scanner
        scanner.close();
    }
}
