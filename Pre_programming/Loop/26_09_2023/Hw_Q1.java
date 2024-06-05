/*
11111
 1111
  111
   11
    1
*/

class Hw_Q1 {
	public static void main(String[] args) {
		int i, j;

		for(i=0;i<5;i++){
			for(j=0;j<5;j++){
				if(i<=j){
					System.out.print("1");
				}else{
					System.out.print(" ");
				}
			}System.out.println(" ");
		}
	}
}