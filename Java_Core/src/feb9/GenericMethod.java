package feb9;

public class GenericMethod {

    public static <T> T getFirstElement(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty.");
        }
        return array[0];
    }

    public static void main(String[] args) {
        String[] stringArray = {"Hello0", "world"};
        Integer[] integerArray = {10, 2, 3};
        Double[] doubleArray = {3.145, 1.59};

        System.out.println(getFirstElement(stringArray)); // Output: Hello
        System.out.println(getFirstElement(integerArray)); // Output: 1
        System.out.println(getFirstElement(doubleArray)); // Output: 3.14
    }
}
