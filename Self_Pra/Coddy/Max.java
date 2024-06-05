// Write a function named max that receives two numbers as input and returns the bigger number among the two.
// For example let's assume the input is 132 and 154. the function should return 154 because it is bigger than 132.

public class Max {
    public static int findMax(int num1, int num2) {
        return Math.max(num1, num2);
    }

    public static void main(String[] args) {
        // Example usage:
        int number1 = 132;
        int number2 = 154;
        int result = findMax(number1, number2);
        System.out.println(result); // Output: 154
    }
}
