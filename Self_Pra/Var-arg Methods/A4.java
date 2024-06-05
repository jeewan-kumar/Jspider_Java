public class A4 {
    public static void m1(int... x){
        System.out.println("int...");
    }
    public static void m1(int[] x){
        System.out.println("int[]");
    }
    public static void main(String[] args) {
         m1(10);// cannot declare both m1(int[]) and m1(int...) in A4
    }
}
