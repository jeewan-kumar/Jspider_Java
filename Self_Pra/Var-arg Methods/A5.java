public class A5 {
    public static void main(String[] args) {
        m1(10);//method m1(int) is already defined in class A5          
    }
    public static void m1(int i){
        System.out.println("return type void");
    }
    public static int m1(int i){
        return 10;
    }
}
