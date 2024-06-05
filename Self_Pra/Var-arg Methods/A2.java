public class A2 {
    public static void main(String[] args) {
        sum(); //The number of arguments:0
        sum(10);//The number of arguments:1
        sum(10,20);//The number of arguments:2
        sum(10,20,30);//The number of arguments:3
    }
    public static void sum(int... a){
        System.out.println("The number of arguments:"+a.length);
    }
}
