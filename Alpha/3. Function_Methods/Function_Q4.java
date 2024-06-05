public class Function_Q4 {
    public static void main(String[] args) {
        System.out.println("Sum of two number : "+add(10,15));
        System.out.println("Sum of three number : "+add(10,15,16));
    }
    public static int add(int a, int b) {
        return a+b;        
    }
    public static int add(int a, int b, int c) {
        return a+b+c;
    }
}
