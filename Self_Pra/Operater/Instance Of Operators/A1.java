public class A1 {
    public static void main(String[] args) {
        Thread t = new Thread();
        System.out.println(t instanceof String); //Thread cannot be converted to String 
        System.out.println(null instanceof Thread); //false
        System.out.println(null instanceof Runnable); //false
    }
}