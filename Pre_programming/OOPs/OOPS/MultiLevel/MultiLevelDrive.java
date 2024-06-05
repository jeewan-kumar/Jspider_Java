public class MultiLevelDrive {
    public static void main(String[] args) {
        MultiLevel2 m = new MultiLevel2();       
        
        m.m2();
        System.out.println(m.name2);
        m.m1();
        System.out.println(m.name1);
        m.m();
        System.out.println(m.name);
        
    }
}