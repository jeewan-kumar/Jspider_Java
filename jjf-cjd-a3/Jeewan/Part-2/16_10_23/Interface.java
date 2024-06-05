interface A {
    int i =5;
     public static void main(String[] args) {
        
        System.out.println("hii");
        System.out.println(i);
        //m1();
    }
    default void m1(){
        System.out.println("hii");
    }
}