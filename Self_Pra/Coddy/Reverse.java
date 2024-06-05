public class Reverse {
    public static String reverse(String s) {
        StringBuilder reverse = new StringBuilder(s);
        return reverse.reverse().toString();// Write code here
    }
    public static void main(String[] args) {
        // Example usage:
        String originalString = "Hello, World!";
        String reversedString = reverse(originalString);
        System.out.println("Original: " + originalString);
        System.out.println("Reversed: " + reversedString);
    }
}
