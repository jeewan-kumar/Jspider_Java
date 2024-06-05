public class SingleLevel1 extends SingleLeve {
    int x = 20;
    public void m2() {
        System.out.println(" Hi.. i am subclass");
    }
    public static void main(String[] args) {
        SingleLevel1 s = new SingleLevel1();
        s.m2();
        System.out.println(s.x);
        s.m1();
        System.out.println(s.y);
        
    }
}
