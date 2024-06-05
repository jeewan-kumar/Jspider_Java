public class H {    
    public static void main(String[] args) {
        System.out.println("Parent main");//Parent main
    }
 }
class C extends H {
    public static void main(String[] args) {
        System.out.println("child main");
    }
}
    /*
     output : - 
     java G - o/p - parent main
     java C - o/p - error: can't find main(String[]) method in class: C   
     */

