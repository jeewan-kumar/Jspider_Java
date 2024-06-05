public class A8 {
    public static void main(String[] args) {
        int i =0;
        for(int j = 0; j<3;j++){
            i =i+j;
        }
        try {
            int j = Integer.parseInt("ten");
        } catch(NumberFormatException e) {
            j=10;
        }
        System.out.println(j);
    }
}
