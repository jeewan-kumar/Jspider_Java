public class A {
    public static void main(String[] args) {
        String s = new String("Jeewan");
        System.out.println(s == null); // false

        s = null;
        System.out.println(s == null); //true

        System.out.println(null == null); //true
    }
}
