public class A8 {
   public static void main(String[] args) {
    boolean b = true;
    System.out.println(b);

    // b = 0;
    // System.out.println(b); //int cannot be converted to boolean                    

    b = True;
    System.out.println(b); //cannot find symbol

    b = "true";
    System.out.println(b); //incompatible types
   } 
}
