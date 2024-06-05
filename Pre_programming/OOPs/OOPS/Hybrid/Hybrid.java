public class Hybrid  {
    
    String name; 
    
    Hybrid(String name) {
        this.name = name;
    }
    public void m() {
        System.out.println("Name: "+name);
    }
    public static void main(String[] args) {
        Hybrid h = new Hybrid("Jeewan");
        h.m();
    }
}