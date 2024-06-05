class A1 {
    public static void main(String[] args) {
        int x= (10<20)?30:40;
        System.out.println(x); //30

        int y = (10>20) ?30 :((40>50)?60:70);
        System.out.println(y); //70
    }
}