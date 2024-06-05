public class A6 {
    public static void main(String[] args) {
        int x =10, y =15;
        if(++x<10 & (x/0>10)) {
           System.out.println("Hello");
        }
        else {
           System.out.println("Hii");
        }
    }   
}

// Output - java.lang.ArithmeticException: / by zero