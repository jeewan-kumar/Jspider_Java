package Arithmetic;

public class A1 {
    public static void main(String[] args) {
        System.out.println(10/0); //java.lang.ArithmeticException/ by zero at Arithmatic
        System.out.println(10/0.0); //Infinity
        System.out.println(0/0);//java.lang.ArithmeticException / by zero at Arithmatic
        System.out.println(0.0/0);//Nan (not a number)
        System.out.println(-10.0/0);//-Infinity
    }
}
