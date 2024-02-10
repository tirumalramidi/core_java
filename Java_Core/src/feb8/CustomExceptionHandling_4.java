package feb8;

import java.io.*;

public class CustomExceptionHandling_4 {
    public static void main(String[] args) {
        String filePath = "/Users/tirumalreddyramidi/Desktop/Java_Core/Java_Core/src/feb8/input.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String firstNumberStr = reader.readLine();
            String secondNumberStr = reader.readLine();

            int firstNumber = Integer.parseInt(firstNumberStr);
            int secondNumber = Integer.parseInt(secondNumberStr);

            if (secondNumber == 0) {
                throw new InvalidInputException("Division by zero is not allowed!");
            }

            int result = firstNumber / secondNumber;
            System.out.println("Result: " + result);

        } catch (FileNotFoundException e) {
            // Handle file not found exception
        } catch (IOException e) {
            // Handle other I/O exceptions
        } catch (NumberFormatException e) {
            // Handle invalid number format
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage()); // Print custom exception message
        }
    }
}

class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}
