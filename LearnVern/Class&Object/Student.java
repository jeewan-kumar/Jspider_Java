class Student {
    int rollNo;
    String name;
    float marks;
    
    void setRollNo(int rn) {
        rollNo = rn;
    }

    int getRollNo(){
        return rollNo;
    }

    void setName(String nm) {
        name = nm;
    }

    String getName() {
        return name;
    }

    void setMarks(float m) {
        marks = m;
    }

    float getMarks() {
        return marks;
    }
    String getGread(){
        if(marks<35)
        return "Fail";
        else
        return "Pass";
    }
    public static void main(String[] args) {
        System.out.println("first student details");
       Student s = new Student(); 
       s.setRollNo(101);
       s.setName("Piyush");
       s.setMarks(45);

       System.out.println("RollNo:"+s.getRollNo());
       System.out.println("Name:"+s.getName());
       System.out.println("Marks:"+s.getMarks());
       System.out.println("Grade:"+s.getGread());

       System.out.println("\nSecond student details");
       Student s1 = new Student(); 
       s1.setRollNo(101);
       s1.setName("Piyush");
       s1.setMarks(45);
       System.out.println("RollNo:"+s1.getRollNo());
       System.out.println("Name:"+s1.getName());
       System.out.println("Marks:"+s1.getMarks());
       System.out.println("Grade:"+s1.getGread());
    }
}