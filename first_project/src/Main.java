import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            // Attempt to open and read from a file
            reader = new BufferedReader(new FileReader("example.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // Handle any I/O exceptions that occur
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        } finally {
            // Ensure that the BufferedReader is closed
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("An error occurred while closing the file: " + e.getMessage());
                }
            }
        }
    }
}
