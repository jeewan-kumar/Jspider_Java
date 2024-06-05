public class Student1 {
    private String name;
    private int roll;

    Student1(String name, int roll) {
        this.name = name;
        this.roll = roll;

    }
    public void getName (int roll) {
        if (this.roll == roll){
            System.out.println(name);
        }
        else {
            System.out.println("Enter the valid number");
        }

    }
    public void setName (String name, int roll) {
        if(this.roll == roll){
            this.name = name;
            System.out.println("name is update");
            
        } else {
            System.out.println("Enter your valid number");
        }
    }
    public void setRoll (int roll, int new_roll) {
        if(this.roll == roll) {
            this.roll = new_roll;
            System.out.println("roll is update");
        } else {
            System.out.println("invalid roll");
        }
    }
    public static void main(String[] args) {
        Student1 s = new Student1("Jeewan", 123);
        System.out.println(s.name);
        System.out.println(s.roll);
        s.getName(123);
        s.setName("guddu",123);
    }

}
