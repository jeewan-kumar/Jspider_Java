import java.util.Scanner;

class Strong {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter your number:- ");
        int i = scr.nextInt();
        if(arm(i)) 
            System.err.println("Strong no. ");
        else
            System.out.println("Not Strong");
    }
    public static boolean arm(int i) {
        int org = i, result=0, rem;
        while(i!=0) {
            rem = i%10;
            result += fact(rem);
            i/=10;
        }
        return result == org;
    }

    public static int fact(int rem) {
        if(rem==0 || rem==1)
        return 1;
        else
        return rem*fact(rem-1);
    }
}
