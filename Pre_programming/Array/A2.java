import java.util.Scanner;
public class A2 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter your array index size: ");
        int n=scr.nextInt();
        int a[] = new int[n];

        for(int i=0; i<=a.length ; i++ ){
            a[i] = scr.nextInt();
        }

        for(int i=0; i<=n ; i++ ){
            System.out.println(a[i]);
        }
    }
}
