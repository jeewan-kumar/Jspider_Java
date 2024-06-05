//wajp to print number from 1 to 20 accept 15;


class Q2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i == 15) {
                continue; 
            }
            System.out.println(i);
        }
    }
}


class Q2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i != 15) {
				 System.out.println(i);                
            }           
        }
    }
}