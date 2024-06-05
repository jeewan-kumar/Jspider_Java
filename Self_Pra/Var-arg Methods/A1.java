public class A1 {
    public static void main(String[] args) {
        sum(); //hii
        sum(10);//hii
        sum(10,20);//hii
        sum(10,20,30);//hii
    }
    public static void sum(int... a){
        System.out.println("hii");
    }
}
