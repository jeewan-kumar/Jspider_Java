// Create a method which accept int and float type argument and return string.

public class Return_String {
    public static void main (String[] args) {
        String s=m1(5,5.5f);
        System.out.println("Return String value = "+s);
    }
    public static String m1(int i, float f) {
        String s="Guddu";
        return s;
    }
}