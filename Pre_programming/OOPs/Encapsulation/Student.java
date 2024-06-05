class Student {
    private String name;
    private int roll;

    Student(String name, int roll) {
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
    public static void main(String[] args) {
        Student s = new Student("Jeewan", 123);
        System.out.println(s.name);
        System.out.println(s.roll);
    }

}