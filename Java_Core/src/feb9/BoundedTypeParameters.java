package feb9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class BoundedTypeParameters {

    public static double calculateSum(Collection<? extends Number> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("Collection cannot be null or empty.");
        }

        double sum = 0.0;
        for (Number number : numbers) {
            if (number != null) { // Handle potential null elements
                sum += number.doubleValue();
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Integer[] integerList = {1, 2, 3, 4, 5};
        Double[] doubleList = {1.5, 2.5, 3.5, 4.5, 5.5};
        Float[] floatList = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f};

        List<Integer> integers = Arrays.asList(integerList);
        List<Double> doubles = Arrays.asList(doubleList);
        List<Float> floats = Arrays.asList(floatList);

        System.out.println("Sum of integers: " + calculateSum(integers));  // Output: 15.0
        System.out.println("Sum of doubles: " + calculateSum(doubles));  // Output: 17.0
        System.out.println("Sum of floats: " + calculateSum(floats));      // Output: 15.0
    }
}
