public class FactorialOfANumbe {
 public static void main(String[] args) {
    int f=factorial(5);
    System.err.println("Factorial = "+f);
 }
 public static int factorial(int n) {
    int j=1;

    for(int i=1;i<=n;i++) {
        j=j*i;
    }
    return j;
 }

}
