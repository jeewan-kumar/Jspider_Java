public class Hybrid3 extends Hybrid1 {
    
    String course;
    
    Hybrid3(String name, int studentId, String course) {
        super(name, studentId);
        this.course = course;
    }
    public void m3() {
        super.m1();
        System.out.println("Teaching Course: "+course);
    }
    public static void main(String[] args) {
        Hybrid3 h1 = new Hybrid3("Guddu", 787079, "MCA");
        h1.m3();
    }
}

