class  A {
    public static void main(String[] args) {
        int a[] = new int[3];
        System.out.println(a);//[I@5acf9800
        System.out.println(a.getClass().getName());//[I

        int b[][] = new int[3][2];
        System.out.println(b);//[[I@4617c264
        System.out.println(b.getClass().getName());//[[I
    }
}