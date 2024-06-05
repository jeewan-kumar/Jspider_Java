public class Revers_the_String {
    public static void main(String[] args) {
        String inputString = "programming";
        
        // Create a StringBuilder and append the reversed characters
        StringBuilder reversedString = new StringBuilder(inputString);
        reversedString = reversedString.reverse();
        
        // Convert the StringBuilder back to a string
        String result = reversedString.toString();
        
        System.out.println("Original String: " + inputString);
        System.out.println("Reversed String: " + result);
    }    
}
