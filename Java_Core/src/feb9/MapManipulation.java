package feb9;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapManipulation {

    public static void main(String[] args) {
        HashMap<String, Integer> wordCounts = new HashMap<>();
        wordCounts.put("apple", 5);
        wordCounts.put("banana", 3);
        wordCounts.put("cherry", 7);

        // Sorting using streams (maintaining insertion order):
        Map<String, Integer> sortedMap = wordCounts.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println("Sorted map (stream):");
        sortedMap.forEach((key, value) -> System.out.println(key + ": " + value));

        // Sorting using a list (alphabetical order within values):
        System.out.println("\nSorted map (list):");
        wordCounts.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEachOrdered(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
