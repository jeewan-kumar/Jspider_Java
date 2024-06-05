import java.util.Scanner;
public class ArmStrong {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int i = s.nextInt();

        if (isArmstrong (i)) 
            System.out.println(i+"is a Armstrong number.");
            else
            System.out.println(i+"is not a Armstrong number.");        
    }
    static boolean isArmstrong(int i) {
        int rem, result=0, original = i;
        int n = isCount(i);
        while(original!=0){
            rem = original % 10;
            result += pow(rem,n);
            original /=10;
        }
        return result == i;
    }
    static int  isCount(int i) {
        int j =0;
        while(i!=0){
            i/=10;
            j++;
        }
        return j;
    }
    static int pow(int rem, int n) {
        int result =1;
        for (int i=0;i<n;i++){
            result *= rem;
        }
        return result;
    }
}
