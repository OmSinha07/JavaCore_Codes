import java.io.*;

public class FileReadWriteExample {
    public static void main(String[] args) {
        String sentence = "KIIT is the best University in the World I Love KIIT";

        // Write the sentence to a file KIIT-1.txt
        try (PrintWriter writer = new PrintWriter(new FileWriter("KIIT-1.txt"))) {
            writer.println(sentence);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Read the file using BufferedReader and FileReader
        try (BufferedReader reader = new BufferedReader(new FileReader("KIIT-1.txt"))) {
            String line = reader.readLine();
            if (line != null) {
                // Count number of words
                int wordCount = line.split("\\s+").length;

                // Count total characters excluding spaces
                int charCount = line.replaceAll("\\s+", "").length();

                // Convert sentence to upper case
                String upperCaseSentence = line.toUpperCase();

                System.out.println("Original Sentence: " + line);
                System.out.println("Word Count: " + wordCount);
                System.out.println("Character Count (excluding spaces): " + charCount);
                System.out.println("Upper-case Sentence: " + upperCaseSentence);

                // Write the upper-case sentence to KIIT-2.txt
                try (PrintWriter writer = new PrintWriter(new FileWriter("KIIT-2.txt"))) {
                    writer.println(upperCaseSentence);
                } catch (IOException ex) {
                    System.out.println("Error writing to file KIIT-2.txt: " + ex.getMessage());
                }
            } else {
                System.out.println("File is empty.");
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}