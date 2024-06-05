public class Employee {
    String ename;
    int eid;
    Employee(){
        System.out.println("acc is created");
    }
    Employee(String ename){
        this.ename=ename;
        System.out.println("ACC is created");
    }
    Employee(int eid) {
        this.eid =eid;
        System.out.println("Acc id created");
    }
    Employee(String ename, int eid) {
        this.ename=ename;
        this.eid=eid;
        System.out.println("Acc id created");
    }
    public static void main(String[] args) {
        Employee e1=new Employee();
        Employee e2=new Employee();
        Employee e3=new Employee("Jeewan");
        Employee e4=new Employee(100);
        Employee e5=new Employee("guddu",554);
    }
}
