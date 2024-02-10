package feb9;


import java.util.List;

public class WildcardsWithGenerics {

    public static void doubleNumbers(List<? extends Number> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("List cannot be null or empty.");
        }

        for (Number number : numbers) {
            if (number != null) { // Handle potential null elements
                double doubledValue = number.doubleValue() * 2;
                System.out.println(doubledValue);
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3, 4, 5);
        List<Double> doubleList = List.of(1.5, 2.5, 3.5, 4.5, 5.5);
        List<Float> floatList = List.of(1.0f, 2.0f, 3.0f, 4.0f, 5.0f);

        doubleNumbers(integerList);  // Output: 2.0, 4.0, 6.0, 8.0, 10.0
        doubleNumbers(doubleList);  // Output: 3.0, 5.0, 7.0, 9.0, 11.0
        doubleNumbers(floatList);      // Output: 2.0, 4.0, 6.0, 8.0, 10.0
    }
}
