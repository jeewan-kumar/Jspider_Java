public class A3 {
    public static void main(String[] args) {
        float f = 10l;
        System.out.println(f);//10.0

        f = 10d;
        System.out.println(f); //cannot convert from double to float, possible lossy conversion from double to float                        
    }
}
