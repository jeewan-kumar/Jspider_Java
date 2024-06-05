public class HierarchicalDrive {
    public static void main(String[] args) {
        Hierarchical1 h = new Hierarchical1();
        h.m();
        h.m1();
        System.out.println(h.name);
        System.out.println(h.name1);

        Hierarchical2 h1 = new Hierarchical2();
        h1.m();
        h1.m1();
        System.out.println(h1.name);
        System.out.println(h1.name1);

        Hierarchical3 h2 = new Hierarchical3();
        h2.m();
        h2.m1();
        System.out.println(h2.name);
        System.out.println(h2.name1);
    }
}