public class Shorting_String {
    public static void main(String[] args) {
        String inputString = "programming";
        
        // Convert the string to a character array
        char[] charArray = inputString.toCharArray();
        
        // Sort the character array
        java.util.Arrays.sort(charArray);
        
        // Convert the sorted character array back to a string
        String sortedString = new String(charArray);
        
        System.out.println("Original String: " + inputString);
        System.out.println("Sorted String: " + sortedString);
    }
}
