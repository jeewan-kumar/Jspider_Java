public class Cla {
    public static void main(String[] args) {
        // String name[] = {"Jeevan","Rahul","Sachin"};
        // int roll[] = {456,847,654,};
        // long phon[] = {7870794231l,9955446348l,7870794257l};
        // String add[] = {"Delhi","new Delhi", "bhopal"};

        // for (String n : name) {
        //     System.out.println("Name :"+n);
        // }
        // for (int n : roll) {
        //     System.out.println("Roll no"+n);
        // }
        // for (long n : phon) {
        //     System.out.println("Phone No."+n);
        // }
        // for (String n : add) {
        //     System.out.println("Address"+n);
        //}
        String s[][] = new String[4][4];
        s[0][0] = "Jeewn";
        s[0][1] = "9955446348"; 
        s[0][2] = "8877";
        s[0][3] = "Kharra"; 

        s[1][0] = "Jeewn";
        s[1][1] = "9955446348"; 
        s[1][2] = "8877";
        s[1][3] = "Kharra"; 

        s[2][0] = "Jeewn";
        s[2][1] = "9955446348"; 
        s[2][2] = "8877";
        s[2][3] = "Kharra"; 

        s[3][0] = "Jeewn";
        s[3][1] = "9955446348"; 
        s[3][2] = "8877";
        s[3][3] = "Kharra"; 

        for (int i = 0; i < 3; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("First Name: " + s[i][0]);
            System.out.println("Phone no: " + s[i][1]);
            System.out.println("Roll No: " + s[i][2]);
            System.out.println("Address: " + s[i][3]);
            System.out.println("----------------");
        }
    }

}
