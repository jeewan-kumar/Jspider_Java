public class A5 {
    public static void main(String[] args) {
        // double d = 0786;
        // System.out.println(d); //The literal 0786 of type int is out of range 

        double d1 = 0xFace;
        System.out.println(d1);//64206.0

        double d2 = 0786.0;
        System.out.println(d2);//786.0

        // double d3 = 0xFace.0;
        // System.out.println(d3);//malformed floating-point literal 

        double d4 = 0777;
        System.out.println(d4);//511.0
    }
}
