public class A2 {
   public static void main(String[] args) {
    int x = 130;

    // byte b = x;
    // System.out.println(b); // possible lossy conversion from int to byte

    byte b = (byte) x;
    System.out.println(b); // -126
   } 
}
