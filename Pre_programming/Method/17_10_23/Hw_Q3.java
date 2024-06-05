//Create a static method inside a class try to access it different way within same class as well as different class.

public class Hw_Q3 {
    static String s = "Jeewan";
    public static void main(String[] args) {
        directly();
       classname();
       Hw_Q3 s= new Hw_Q3();
       s.reference();
    }
    public static void directly() {
        System.out.println("Directly access : "+s);           
    }
    public static void classname() {
        System.out.println("Access With the help of class name : "+Hw_Q3.s);    
    }
    public static void reference() {
        Hw_Q3 s= new Hw_Q3();
        System.out.println("Acess with the help of reference : "+s.s);
    }
}
