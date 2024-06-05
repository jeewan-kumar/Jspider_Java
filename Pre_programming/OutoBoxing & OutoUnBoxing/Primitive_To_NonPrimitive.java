public class Primitive_To_NonPrimitive {
    public static void main(String[] args) {
        String s = "6";
        int a = Integer.parseInt(s);
        System.out.println(s+5);
        System.out.println(a+5);

        String b = "true";
        boolean c = Boolean.parseBoolean(b);
        System.out.println(c&&b);
    }
}
