import java.util.HashMap;
import java.util.Map;

public class Frequency_of_character {
    public static void main(String[] args) {
        String inputString = "programming";
        
        // Create a HashMap to store character frequencies
        Map<Character, Integer> frequencyMap = new HashMap<>();
        
        // Convert the string to a character array
        char[] charArray = inputString.toCharArray();
        
        // Iterate through the character array and update the frequency map
        for (char ch : charArray) {
            if (frequencyMap.containsKey(ch)) {
                // If the character is already in the map, increment its frequency
                frequencyMap.put(ch, frequencyMap.get(ch) + 1);
            } else {
                // If the character is not in the map, add it with a frequency of 1
                frequencyMap.put(ch, 1);
            }
        }
        
        // Print the character frequencies
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Character '" + entry.getKey() + "' occurs " + entry.getValue() + " times.");
        }
    }    
}
