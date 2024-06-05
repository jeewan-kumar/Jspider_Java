class A {
    int x = 10;
    public static void main(String[] args) {
        // System.out.println(x); //non-static variable x cannot be referenced from a static context
        
        A t = new A();
        System.out.println(t.x);//10  
        t.m1();     
        
    }
    public void m1(){
            System.out.println(x);//10
    }
}