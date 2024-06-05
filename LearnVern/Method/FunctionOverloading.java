import java.lang.Math;
class FunctionOverloading {
    public static void main(String[] args) {
        int radius = 5;
        int length =6, width =7;
        int a =8, b=9, c=3;

        System.out.println("The area of circle is: "+area(radius));
        System.out.println("The area of Rectangle is: "+area(length, width));
        System.out.println("The area of tringle is: "+area(a,b,c));
    }
    static float area(int r){
        return 22/7*r*r;
    }

    static float area (int l, int w) {
        return l*w;
    } 
    static double area (int a, int b, int c) {
        double s = (a+b+c)/2.0;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}

