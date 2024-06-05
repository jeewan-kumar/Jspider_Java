
public class Q2 {
    public static void main(String[] args) {
         // Create an array of int
         int[] intArray = new int[5];

         // Add elements to the array by index
         for (int i = 0; i < 5; i++) {
             intArray[i] = i + 1;
         }
         System.out.println("Reference variable: " + intArray);

         // Access each element by reference
        System.out.println("Access each element by reference:");
        System.out.println("intArray[2]: " + intArray[2]);
        System.out.println("intArray[4]: " + intArray[4]);
    }
}
