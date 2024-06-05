class A{
    public static void main(String[] args) {
        sum(10,20);
        sum(10,20,30);
        sum(10,20,30,40);
        sum(10,20,30,40,50);
    }
    public static void sum(int a, int b){
        System.out.println(a+b); //30
    }

     public static void sum(int a, int b,int c){
        System.out.println(a+b+c);//60
    }

     public static void sum(int a, int b,int c, int d){
        System.out.println(a+b+c+d); //100
    }

     public static void sum(int a, int b,int c, int d, int e){
        System.out.println(a+b+c+d+e);//150
    }
}