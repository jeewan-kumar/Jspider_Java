//Wajp Create a static variable inside the class and access it with the help of class name object reference and directly 

public class Hw_Q1 {
    static int s =50;
    public static void main(String[] args) {
        System.out.println("Diretly : "+s);
        System.out.println("With the help of class name : "+Hw_Q1.s);
        Hw_Q1 a= new Hw_Q1();
        System.out.println("With the help of object refernce : "+a.s);
    }
}
