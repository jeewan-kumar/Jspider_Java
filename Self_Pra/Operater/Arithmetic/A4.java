public class A4 {
    public static void main(String[] args) {
        System.out.println(10 < Float.NaN); //false
        System.out.println(10 <= Float.NaN);//false
        System.out.println(10 > Float.NaN);//false
        System.out.println(10 >= Float.NaN); //false
        System.out.println(Float.NaN == Float.NaN); //false
        System.out.println(10 != Float.NaN);// true
        System.out.println(Float.NaN != Float.NaN); // true
    }
}
