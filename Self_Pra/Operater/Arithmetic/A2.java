package Arithmetic;

public class A2 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        byte c = a+b;
        System.out.println(c); //possible lossy conversion from int to byte

        byte c = (byte)(a+b);
        System.out.println(c); //30
    }    
}
