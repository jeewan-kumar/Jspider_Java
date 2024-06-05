public class PrimeOrNOt {
    public static void main(String[] args) {
        System.out.println(prime(2));
    }
    public static String prime(int n) {
        if(n==2){
            return "Is a prime number";
        }
        for(int i=2;i<=n-1; i++ ) {
            if(n%i==0)
            return "Not a Prime number";
        }
        return "Is a prime number";
    }
}
