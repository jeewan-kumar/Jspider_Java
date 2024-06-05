import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter you number : ");
        long n=s.nextLong();
        double f=fac(n);
        System.out.println("Factorial Valu = "+f);
    }
    public static double fac(long n) {
       double j=1;
       
       for(int i=1; i<=n; i++) {
        j=j*i;
       }
       return j;

       // Once after a time it will give the decimal value definitly that is not in our control ,
    }
}
