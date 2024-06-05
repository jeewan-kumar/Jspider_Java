//ncr = n!/r!*(n-r)!
import java.util.*;

public class Binomial_Coefficient {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the N value number : ");
        double n=s.nextDouble();

        System.out.print("Enter the R value number : ");
        double r=s.nextDouble();

        double d=bino(n,r);

        System.out.println("Binomial value : "+d);
    }
    public static double bino(double n, double r) {
        double n1=fect(n);
        double r1=fect(r);
        double rn=fect(n-r);

        double bin=n1/(r1*rn);
        return bin;
    }
    public static double fect(double r) {
        double d=1;

        for (int i=1;i<=r;i++) {
            d=d*i;
        }
        return d;

    }
}