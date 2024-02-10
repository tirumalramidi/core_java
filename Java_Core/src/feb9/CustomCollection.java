package feb9;

import java.lang.reflect.Array;

public class CustomCollection<T> {

    private T[] data;
    private int size;

    public CustomCollection(Class<T> elementType, int initialCapacity) {
        this.data = (T[]) Array.newInstance(elementType, initialCapacity);
        this.size = 0;
    }

    public void add(T element) {
        if (size == data.length) {
            resize();
        }
        data[size++] = element;
    }

    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds.");
        }

        T removedElement = data[index];
        System.arraycopy(data, index + 1, data, index, size - index - 1);
        size--;
        return removedElement;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds.");
        }
        return data[index];
    }

    private void resize() {
        T[] newData = (T[]) Array.newInstance(data.getClass().getComponentType(), data.length * 2);
        System.arraycopy(data, 0, newData, 0, size);
        data = newData;
    }

    public static void main(String[] args) {
        CustomCollection<String> collection = new CustomCollection<>(String.class, 4);
        collection.add("apple");
        collection.add("banana");
        collection.add("cherry");

        System.out.println(collection.get(1)); // Output: banana
        collection.remove(0); // Remove "apple"

        for (int i = 0; i < collection.size; i++) {
            System.out.println(collection.get(i)); // Output: banana, cherry
        }
    }
}
