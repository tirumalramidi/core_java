package feb8;


import java.io.*;
import java.util.Scanner;

public class FileReadWrite_6 {

    public static void main(String[] args) {
        String text = getUserInput();


        try (FileWriter writer = new FileWriter("/Users/tirumalreddyramidi/Desktop/Java_Core/Java_Core/src/feb8/output.txt", true);

             BufferedReader reader = new BufferedReader(new FileReader("/Users/tirumalreddyramidi/Desktop/Java_Core/Java_Core/src/feb8/output.txt"))) {
            // Write to file
            writer.write(text + "\n");
            System.out.println("Text written to 'output.txt' successfully.");

            // Read from file
            System.out.println("Contents of 'output.txt':");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error: File 'output.txt' not found.");
        } catch (IOException e) {
            System.err.println("Error reading/writing to file: " + e.getMessage());
        } finally {
            System.out.println("Program execution finished.");
        }
    }

    private static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your text: ");
        return scanner.nextLine();
    }
}

