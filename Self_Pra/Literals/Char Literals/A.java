class A{
    public static void main(String[] args) {
        char ch=97;
        System.out.println(ch);//a

        ch = 0xFace;
        System.out.println(ch);//?

        ch = 0777;
        System.out.println(ch);//?

        ch = 65535;
        System.out.println(ch);//?
    }
}