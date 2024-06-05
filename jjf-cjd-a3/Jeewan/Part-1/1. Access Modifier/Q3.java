// Access modifier protected

/*class Q3 {
    protected void protectedMethod() {
        System.out.println("This is a protected method in the ParentClass.");
    }
}*/

class Q3 {
    public static void main(String[] args) {
        Q3 subclass = new Q3();
        subclass.Q3();
    }

    public void Q3() {
        System.out.println("Calling a protected method from a subclass:");
        //subclass.Q3();
        //protectedMethod(); 
    }
}