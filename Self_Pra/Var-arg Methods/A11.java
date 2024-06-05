public class A11 {
    public static void main(String[] args) {
        int[] a = {10,20,30};
        int[] b = {40,50,60};
        m1(a,b);
    }
    public static void m1(int[]... x){
        for(int[] x1: x){
            for(int x2:x1){
                System.out.print(x2+",");
            }     
            System.out.println();       
        }
    }
}
/*Output -
 * 10,20,30,
 * 40,50,60,
 */
