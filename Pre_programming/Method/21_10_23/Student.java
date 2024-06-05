class Student {
    String name ;
    long phon;
    public static void main(String[] args) {

        
        Student s = new Student();
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();

        System.out.println("\n***** Reference *****");
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        
        System.out.println("\n***** Reference with Variable 1 *****");
        System.out.println(s.name);
        System.out.println(s.phon);

        System.out.println("\n***** Reference with Variable 2 *****");
        System.out.println(s1.name);
        System.out.println(s1.phon);

        System.out.println("\n***** Reference with Variable 3 *****");
        System.out.println(s2.name);
        System.out.println(s1.phon);

        System.out.println("\n***** Reference with Variable 4 *****");
        System.out.println(s3.name);
        System.out.println(s3.phon);

        System.out.println("\n***** Reference with Variable 5 *****");
        System.out.println(s4.name);
        System.out.println(s4.phon);


    }
}