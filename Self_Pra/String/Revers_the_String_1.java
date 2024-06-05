public class Revers_the_String_1 {
    public static void main(String[] args) {
        String inputString = "programming";
        
        // Convert the string to a character array
        char[] charArray = inputString.toCharArray();
        
        // Reverse the character array manually
        int left = 0;
        int right = charArray.length - 1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        
        // Convert the character array back to a string
        String result = new String(charArray);
        
        System.out.println("Original String: " + inputString);
        System.out.println("Reversed String: " + result);
    }
}
