public class A3 {
    public static void main(String[] args) {
        int[] i = {44,55,66};
        char[] c = {'a','b','c'};
        String[] s = {"A","AAA","AAAA"};

        for(int i1:i){
            System.out.print(i1+", ");
        } System.out.println();

        for(char c1:c){
            System.out.print(c1+", ");
        }System.out.println();

        for(String s1:s){
            System.out.print(s1+", ");
        }System.out.println();
    }
}
/*OutPut -
 * 44, 55, 66, 
 * a, b, c,
 * A, AAA, AAAA,
 */