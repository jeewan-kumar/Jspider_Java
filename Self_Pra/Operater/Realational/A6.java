public class A6 {
    public static void main(String[] args) {
        String s = new String("Jeewan");
        String s1 = new String("Jeewan");

        System.out.println(s == s1); //false
        System.out.println(s.equals(s1)); //true
    }    
}
