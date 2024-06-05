package Encapsulation;

public class Emp {
	private String eName;
    private int eId;
    private int eSalary;

    Emp(String eName, int eId, int eSalary){
        this.eName=eName;
        this.eId=eId;
        this.eSalary=eSalary;
    }
    
    public void getName(int eId){
        if(this.eId==eId){
            System.out.println("Emp Name: "+eName);
        } else {
            System.out.println("Invalid id");
        }
    }

    public void getId(int eId){
        if(this.eId==eId){
            System.out.println("Emp Id: "+eId);
        } else {
            System.out.println("Invalid id");
        }
    }

    public void getSalary(int eId){
        if(this.eId==eId){
            System.out.println("Emp Salary: "+eSalary);
        } else {
            System.out.println("Invalid id");
        }
    }

    public void setName (String eName, int eId) {
        if(this.eId==eId){
            this.eName=eName;
            System.out.println("name updated");
        } else {
            System.out.println("Invilid Id");
        }
    }

    public static void main(String[] args) {
        Emp e = new Emp("Jeewan", 995544, 35000);
        System.out.println("Emp Name: "+e.eName);
        System.out.println("Emp Id: "+e.eId);
        System.out.println("Emp Salary: "+e.eSalary);

        e.setName("Guddu",995544);

        System.out.println("Emp Name: "+e.eName);
        System.out.println("Emp Id: "+e.eId);
        System.out.println("Emp Salary: "+e.eSalary);
    }

}
