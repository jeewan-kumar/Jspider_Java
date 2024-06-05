public class Prime_Optimize {
    public static void main(String[] args) {
        System.out.println(prime(6));
    }
    public static String prime(int n) {
        for(int i=2; i<=Math.sqrt(n);i++){
            if(n%i==0){
                return "Not a prime number";
            }
        }return "Is a prime number";
    }
}
