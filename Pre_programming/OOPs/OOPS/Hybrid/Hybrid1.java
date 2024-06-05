public class Hybrid1 extends Hybrid {
    int studentId; 
    
    Hybrid1(String name, int studentId) {
        super(name);
        this.studentId = studentId; 
    }
    public void m1() {
        super.m();
        System.out.println("Student ID: "+studentId);
    }
    public static void main(String[] args) {
        Hybrid1 h = new Hybrid1("Jeewan",995544);
        h.m1();
    }
}
