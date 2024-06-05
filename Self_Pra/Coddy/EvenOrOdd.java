class EvenOrOdd {
    public static String evenOrOdd(int a) {
        if(a%2==0){
            return "EVEN";
        } else {
            return "ODD";
        }
    }
    public static void main(String[] args){
        int number = 30;
        String result = evenOrOdd(number);
        System.out.println(number + " is " + result);
    }
}