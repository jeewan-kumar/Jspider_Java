public class Data_Type_over {
    public static void main(String[] args) {
        System.out.println("Sum of two number : "+add(10,15));
        System.out.println("Sum of three number : "+add(7.5f,15.65f,88.60f));
    }
    public static int add(int a, int b) {
        return a+b;        
    }
    public static float add(float a, float b, float c) {
        return a+b+c;
    }
}
