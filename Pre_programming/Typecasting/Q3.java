// WAJP to store int value into the byte, short, long, float,double,char type variable.
public class Q3 {
    public static void main(String[] args) {
        
        int i = 100;
        byte b = (byte)i;
        short s= (short)i;
        long l=(long)i;
        float f=(float)i;
        double d=(double)i;
        char ch=(char)i;

        System.out.println("Integer : "+i);
        System.out.println("Byte : "+b);
        System.out.println("Short : "+s);
        System.out.println("Long : "+l);
        System.out.println("Float : "+ f);
        System.out.println("Character : "+ch);
        System.out.println("Douable : "+d);
    }    
}
