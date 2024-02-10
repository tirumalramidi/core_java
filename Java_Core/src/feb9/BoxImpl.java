package feb9;

public class BoxImpl {


    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("Hello World!");
        System.out.println(stringBox.get()); // Output: Hello World!

        Box<Integer> integerBox = new Box<>(42);
        System.out.println(integerBox.get()); // Output: 42

        Box<Double> doubleBox = new Box<>(3.14);
        System.out.println(doubleBox.get()); // Output: 3.14

    }

}
