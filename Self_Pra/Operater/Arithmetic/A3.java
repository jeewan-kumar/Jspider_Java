package Arithmetic;

public class A3 {
    public static void main(String[] args) {
        byte b = 10;
        
        b = b+1;
        System.out.println(b); //possible lossy conversion from int to byte

        // b++;
        // System.out.println(b); //10
    }
}
