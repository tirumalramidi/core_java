package feb9;



import java.util.ArrayList;
import java.util.List;

public class LambdaFunctions {

    public static List<Integer> filterEvenNumbers(List<Integer> numbers) {
        List<Integer> oddNumbers = new ArrayList<>(numbers); // Create a copy to avoid modifying the original list
        oddNumbers.removeIf(number -> number % 2 == 0); // Remove even numbers using removeIf
        return oddNumbers;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> oddNumbers = filterEvenNumbers(numbers);

        System.out.println("Original list: " + numbers);
        System.out.println("List with odd numbers: " + oddNumbers);
    }
}
