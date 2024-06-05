public class Student1 {
    String name ;
    long phon;
    Student1() {
        System.out.println("welcome");
    }
    public static void main(String[] args) {
        
        Student1 s = new Student1();
        Student1 s1 = new Student1();
       
        System.out.println("\n***** Reference *****");
        System.out.println(s);
        System.out.println(s1);        
        
        System.out.println(s.name);
        System.out.println(s.phon);
        
    }
}
