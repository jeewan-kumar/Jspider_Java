public class RangeOfPrime {
    public static void main(String[] args) {
       range(1000); 
    }
    public static void range(int a) {
        for (int i=2;i<=a;i++){
            if(prime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean prime(int n) {
        for(int i=2; i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }return true;
    }
}
