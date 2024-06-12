import java.io.*;
import java.util.Scanner;

class NumberArray {
    int[] data;
    int size;

    NumberArray(int size, int lowerBound, int upperBound) {
        this.size = size;
        data = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            data[i] = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        }
    }

    void storeToFile(String filename) {
        try {
            FileWriter writer = new FileWriter(filename);
            for (int num : data) {
                writer.write(num + " ");
            }
            writer.close();
            System.out.println("Integers written to " + filename);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    void loadFromFile(String filename) {
        try {
            Scanner scanner = new Scanner(new File(filename));
            int i = 0;
            while (scanner.hasNextInt() && i < size) {
                data[i++] = scanner.nextInt();
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }

    void sortArray() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    void displayArray() {
        for (int num : data) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

public class NumberFileProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of integers (n): ");
        int n = scanner.nextInt();
        System.out.print("Enter lower bound: ");
        int lowerBound = scanner.nextInt();
        System.out.print("Enter upper bound: ");
        int upperBound = scanner.nextInt();

        NumberArray numbers = new NumberArray(n, lowerBound, upperBound);

        // Store to first file
        numbers.storeToFile("numbers1.txt");

        // Load from file
        numbers.loadFromFile("numbers1.txt");

        // Sort the array
        numbers.sortArray();

        // Display the sorted array
        System.out.println("Sorted array:");
        numbers.displayArray();

        // Store to second file
        numbers.storeToFile("numbers2.txt");
    }
}
