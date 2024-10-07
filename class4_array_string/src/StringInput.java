import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string:");
        String userInput = scanner.nextLine();  // Read the input string

        // Display the original string
        System.out.println("You entered: " + userInput);

        // 1. Find the length of the string
        int length = userInput.length();
        System.out.println("Length of the string: " + length);

        // 2. Convert the string to uppercase
        String upperCaseString = userInput.toUpperCase();
        System.out.println("Uppercase version: " + upperCaseString);

        // 3. Convert the string to lowercase
        String lowerCaseString = userInput.toLowerCase();
        System.out.println("Lowercase version: " + lowerCaseString);

        // 4. Extract a substring (from index 2 to 5)
        if (length >= 5) {
            String subString = userInput.substring(2, 5);
            System.out.println("Substring from index 2 to 5: " + subString);
        } else {
            System.out.println("String is too short for substring extraction.");
        }

        // 5. Check if the string contains a specific word
        System.out.println("Enter a word to search in the string:");
        String searchWord = scanner.nextLine();
        boolean containsWord = userInput.contains(searchWord);
        System.out.println("Does the string contain '" + searchWord + "'? " + containsWord);

        // 6. Replace a part of the string
        System.out.println("Enter a word to replace in the string:");
        String replaceWord = scanner.nextLine();
        System.out.println("Enter the new word:");
        String newWord = scanner.nextLine();
        String replacedString = userInput.replace(replaceWord, newWord);
        System.out.println("String after replacement: " + replacedString);

        // 7. Split the string into words
        String[] words = userInput.split(" ");
        System.out.println("Words in the string:");
        for (String word : words) {
            System.out.println(word);
        }

        // 8. Trim the string (remove leading and trailing spaces)
        String trimmedString = userInput.trim();
        System.out.println("String after trimming spaces: " + trimmedString);

        // Close the scanner
        scanner.close();
    }
}
