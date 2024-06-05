public class A2 {
    public static void main(String[] args) {
        String a = "Jeewan";
        int b =10, c = 20, d =30;

        a = b+c+d;
        System.out.println(a); //int cannot be converted to String

        a = a+b+c;
        System.out.println(a); //Jeewan1020

        b = a+c+d;
        System.out.println(b); // String cannot be converted to int 

        b = b+c+d;
        System.out.println(b); //60   
        
    }
}
