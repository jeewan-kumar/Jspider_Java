public class Q5 {
    public static void main(String[] args) {
        check(7);
        check(10);
    }

    static void check(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }
}
