public class A6 {
    public static void main(String[] args) {
        int[] a = {4, 5, 7, 8, 9};
        int[] b = {70, 80};

        a=b;
        b=a;

        System.out.println(a);//[I@4617c264
        System.out.println(b);//[I@4617c264
    }
}
