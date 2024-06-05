public class Hybrid2 extends Hybrid {
    int empId;
    
    Hybrid2(String name,int studentId) {
        super(name);
        this.empId = empId;
    }
    public void m2() {
        super.m();
        System.out.println("Emp Id: "+empId);
    }
}
