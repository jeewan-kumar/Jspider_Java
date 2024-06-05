//wajp to print the number which are divisible bye 3 and 5 from 50 to 100.

class Q3 {
    public static void main(String[] args) {
        for (int i = 50; i <= 100; i++) {
            if (i%3==0 && i%5==0) {
                System.out.println(i);
            }            
        }
    }
}