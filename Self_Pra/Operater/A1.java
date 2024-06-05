class A1 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        //byte c = a+b; 
        //System.out.println(c); //error

        byte c = (byte)(a+b);
        System.out.println(c);//30

        a =a+1;
        System.out.println(a); //error 

        a++;
        System.out.println(a);//11

    }
}