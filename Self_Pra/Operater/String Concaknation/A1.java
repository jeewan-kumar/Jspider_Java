class A1 {
    public static void main (String[] args) {

        String a = "Jeewn";
        int b = 10, c = 20, d = 30;
        System.out.println(a+b+c+d); // Jeewan102030
        System.out.println(b+c+d+a); // 60Jeewan
        System.out.println(b+c+a+d); // 30Jeewan30
        System.out.println(b+a+c+d); // 10Jeewan2030
    }
}  