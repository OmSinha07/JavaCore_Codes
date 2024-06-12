import java.io.*;
import java.util.*;

class ArrayOperations {
    private int[] numbers;
    private int size;

    public ArrayOperations(int n) {
        numbers = new int[n];
        size = n;
    }

    public void readFromFile(String fileName) {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            for (int i = 0; i < size && scanner.hasNextInt(); i++) {
                numbers[i] = scanner.nextInt();
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }

    public void sortArray() {
        Arrays.sort(numbers);
    }

    public void replaceDuplicates() {
        List<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < size - 1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                duplicates.add(numbers[i]);
                numbers[i] = 0;
            }
        }

        System.out.println("Duplicate Elements:");
        for (Integer num : duplicates) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public double calculateAverage() {
        int sum = 0, count = 0;
        for (int i = 0; i < size; i++) {
            if (numbers[i] != 0) {
                sum += numbers[i];
                count++;
            }
        }
        return (double) sum / count;
    }

    public void displayArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public void writeToFile(String fileName) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (int i = 0; i < size; i++) {
                writer.write(numbers[i] + " ");
            }
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}

public class ArrayOperationsProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        ArrayOperations array = new ArrayOperations(n);

        // Generate random numbers and store in a file
        try (PrintWriter writer = new PrintWriter(new FileWriter("input_array.txt"))) {
            Random random = new Random();
            for (int i = 0; i < n; i++) {
                int num = random.nextInt(100) + 1; // Generate numbers between 1 and 100
                writer.write(num + " ");
            }
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        array.readFromFile("input_array.txt");8

        System.out.println("Original Array:");
        array.displayArray();

        array.sortArray();
        array.replaceDuplicates();

        System.out.println("Updated Array:");
        array.displayArray();

        double average = array.calculateAverage();
        System.out.println("Average of Updated Array: " + average);

        array.writeToFile("updated_array.txt");

        System.out.println("Array stored in updated_array.txt");
    }
}