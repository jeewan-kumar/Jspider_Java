public class A1 {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(x);//10

        x=040;
        System.out.println(x);//32

        x=050;
        System.out.println(x);//40

        // x=0787;
        // System.out.println(x);//The literal 0787 of type int is out of range 

        x=0777;
        System.out.println(x);//511

        x=0xFace;
        System.out.println(x);//64206

        x=0xBeef;
        System.out.println(x);//48879

        // x=0xBeer;
        // System.out.println(x);//';' expected 
    }
}
