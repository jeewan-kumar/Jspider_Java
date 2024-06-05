public class Student {
    private String sName;
    private int sRoll;

    Student(String sName, int sRoll) {
        this.sName=sName;
        this.sRoll=sRoll;
    }

    public void getName(int sRoll) {
        if(this.sRoll==sRoll) {
            System.out.println(sName);
        } else {
            System.out.println("Invalaid roll number");
        }
        
    }

    public void setName (String sName,int sRoll){
        if(this.sRoll==sRoll){
            this.sName=sName;
            System.out.println("Name is updated");
        } else {
            System.out.println("Invalid roll number");
        }
    }

    public void setRoll(int sRoll, int new_sRoll) {
        if(this.sRoll==sRoll){
            this.sRoll=new_sRoll;
            System.out.println("Roll is update");
        } else {
            System.out.println("Invalid roll number");
        }
    }

    // public static void main(String[] args) {
       
    // }
}