/*
1010
101
10
1
*/

class Hw_Q2 {
	public static void main(String[] args) {
		int i, j;

		for(i=0;i<4;i++){
			for(j=0;j<4-i;j++){
				if(j%2==0){
					System.out.print("1");
				}else{
					System.out.print("0");
				}
			}System.out.println("");
		}
	}
}