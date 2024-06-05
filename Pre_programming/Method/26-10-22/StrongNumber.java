import java.util.Scanner;
public class StrongNumber {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter you number: ");
        int i = scr.nextInt();

        if(check(i))
        System.out.println(i+ " is the strong number.");
        else
        System.out.println(i+ " is not the strong number.");
    }
    static boolean check(int i){
        int original = i, sum=0,rem; 
        while (i!=0) {
            rem = i%10;
            sum += fact(rem);
            i/=10;
        }
        return sum == original;
    }
    static int fact (int rem) {
        int fact =1;
        for (int i = 1; i<=rem;i++) {
            fact*=i;
        }
        return fact;
    }
}
