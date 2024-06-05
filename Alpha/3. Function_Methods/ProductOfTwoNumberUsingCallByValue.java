public class ProductOfTwoNumberUsingCallByValue {
    public static void main(String[] args) {
        int a=3;
        int b=6;
        int product = mul(a,b);
        System.out.println("a*b = "+product);
        product = mul(10,20);
        System.out.println("a*b = "+product);
    }
    
    public static int mul(int a, int b) {
        int product = a*b;
        return product;
    }
}
