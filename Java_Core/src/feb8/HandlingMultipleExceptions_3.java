package feb8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HandlingMultipleExceptions_3 {
    public static void main(String[] args) {
        String filePath = "/Users/tirumalreddyramidi/Desktop/Java_Core/Java_Core/src/feb8/input.txt"; // Relative path to the input file
        BufferedReader reader = null;
        try  {
            reader = new BufferedReader(new FileReader(filePath));
            String firstNumberStr = reader.readLine();
            String secondNumberStr = reader.readLine();

            int firstNumber = Integer.parseInt(firstNumberStr);
            int secondNumber = Integer.parseInt(secondNumberStr);

            int result = firstNumber / secondNumber;
            System.out.println("Result: " + result);

        } catch (FileNotFoundException e) {
            System.out.println("Error: File '" + filePath + "' not found.");
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format in the file.");
        } finally {

            try {
                if (reader != null) {
                    reader.close();
                    System.out.println("File reader closed");
                }
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
        }
    }
}
