import java.util.HashMap;
import java.util.Map;

public class Frequency_of_elements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        
        // Create a HashMap to store element frequencies
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Iterate through the array and update the frequency map
        for (int num : arr) {
            if (frequencyMap.containsKey(num)) {
                // If the element is already in the map, increment its frequency
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                // If the element is not in the map, add it with a frequency of 1
                frequencyMap.put(num, 1);
            }
        }
        
        // Print the frequencies
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Element " + entry.getKey() + " occurs " + entry.getValue() + " times.");
        }
    }
}
