public class A3 {
    public static void main(String[] args) {
        sum(); //The sum : 0
        sum(10);//The sum : 10
        sum(10,20);//The sum : 30
        sum(10,20,30);//The sum : 60
    }
    public static void sum(int... a){
        int total = 0;
        for(int x:a){
            total =total+x;
        }
        System.out.println("The sum : "+total);
    }
}
