public class A2 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        arr[0] = 1;
        arr[1] = 10;
        arr[2] = 100;
        arr[3] = 1000;
        arr[4] = 10000;
        arr[5] = 100000;
        for(int a:arr){
            System.out.println(a);
        }

        arr[-6] = 2;
        System.out.println(arr[-6]); //Index -6 out of bounds for length 6

        arr[6] = 24;
        System.out.println(arr[6]); //java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6

        arr[2.5] = 44;
        System.out.println(arr[2.5]); //possible lossy conversion from double to int
    }
}