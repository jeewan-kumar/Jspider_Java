public class Demo {
    public static void main(String[] args) {
        String s1 = new String("java");
        String s2 = new String("Java");
        String s3 = s1;
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s3);
        System.out.println(s2.equals(s3));        
    }
}
