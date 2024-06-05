public class G {
    public static void main(String[] args) {
        System.out.println("Parent main");//Parent main
    }
}
class C extends G {

}
/*
 output : - 
 java G - o/p - parent main
 java C - o/p - parent main
 */