public class A6 {
    public static void m1(int... x){
        System.out.println("Var-arg method");
    }
    public static void m1(int x){
        System.out.println("General method");
    }
    public static void main(String[] args) {
        m1();//Var-arg method
        m1(10,20);//Var-arg method
        m1(10);//General method
    }
}
