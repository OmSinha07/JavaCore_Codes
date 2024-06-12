import java.io.*;

public class FileOperations {
    public static void main(String[] args) {
        String sentence = "abc";
        String inputFilename = "KIIT-1.txt";
        String outputFilename = "KIIT-2.txt";

        // Write the sentence to KIIT-1.txt
        try (PrintWriter out = new PrintWriter(new FileWriter(inputFilename))) {
            out.println(sentence);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // Read the sentence from KIIT-1.txt and perform operations
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilename))) {
            String line = reader.readLine();
            if (line != null) {
                // Count number of words
                int wordCount = line.split("\\s+").length;
                System.out.println("Number of words: " + wordCount);

                // Count total characters excluding spaces
                int charCount = line.replace(" ", "").length();
                System.out.println("Total characters excluding spaces: " + charCount);

                // Convert sentence to upper case
                String upperCaseSentence = line.toUpperCase();
                System.out.println("Sentence in upper case: " + upperCaseSentence);

                // Write the upper-case sentence to KIIT-2.txt
                try (PrintWriter out = new PrintWriter(new FileWriter(outputFilename))) {
                    out.println(upperCaseSentence);
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file or writing to the file.");
            e.printStackTrace();
        }
    }
}