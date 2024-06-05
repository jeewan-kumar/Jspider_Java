public class A2 {
 public static void main(String[] args) {
    int x = 10;
    x++;
    System.out.println(x); // 11

    char ch = 'a';
    ch++;
    System.out.println(ch); // b

    double d = 10.5;
    d++;
    System.out.println(d); //11.5

    boolean b = true;
    b++;
    System.out.println(b); // bad operand type boolean for unary operator '++'
 }   
}
