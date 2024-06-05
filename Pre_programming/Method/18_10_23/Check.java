//package 18_10_23;

public class Check {
    static int s =5;
    int c=5;
    {
        System.out.println("bye1");
    }
   
    static
    {
        System.out.println("Home lone");
        Check c =new Check();
        System.out.println(c.c);
        System.out.println(s);
    }
    public static void main(String[] args) {
        System.out.println("hii i am jeewan");
    }
    static {
        System.out.println("Hello");
    }
    
    {
        System.out.println("bye");
    }
   
}
