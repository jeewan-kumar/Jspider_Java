public class Revers_The_Sentence {
    public static void main(String[] args) {
        String inputSentence = "This is a sample sentence";

        // Split the sentence into words
        String[] words = inputSentence.split(" ");

        // Create a StringBuilder to store the reversed sentence
        StringBuilder reversedSentence = new StringBuilder();

        // Reverse each word and append it to the reversed sentence
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord = reversedWord.reverse();
            reversedSentence.append(reversedWord).append(" ");
        }

        // Remove the trailing space and convert the StringBuilder to a string
        String result = reversedSentence.toString().trim();

        System.out.println("Original Sentence: " + inputSentence);
        System.out.println("Reversed Sentence: " + result);
    }    
}
