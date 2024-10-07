//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String sentence = "Java is a powerful programming language";

        // Find the length of the string
        System.out.println("Length: " + sentence.length());

        // Extract a substring
        System.out.println("Substring: " + sentence.substring(10, 19));

        // Convert to uppercase
        System.out.println("Uppercase: " + sentence.toUpperCase());

        // Check if it contains "powerful"
        System.out.println("Contains 'powerful': " + sentence.contains("powerful"));

        // Replace "Java" with "Python"
        System.out.println("Replace 'Java' with 'Python': " + sentence.replace("Java", "Python"));

        // Split the string into words
        String[] words = sentence.split(" ");
        System.out.println("Words in the sentence:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}