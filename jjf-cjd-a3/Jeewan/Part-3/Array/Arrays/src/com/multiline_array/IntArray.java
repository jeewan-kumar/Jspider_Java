package com.multiline_array;

public class IntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = {{5,8,5},{65,88},{65}};
		
		System.out.println("Multi Dimensional Array Reference: "+a);
		System.out.println("First row Reference: "+a[0]);
		System.out.println("Second row Reference: "+a[1]);
		System.out.println("Third row Reference: "+a[2]);
		System.out.println("***** Manually Print *****");
		System.out.print(a[0][0]+", ");
		System.out.print(a[0][1]+", ");
		System.out.print(a[0][2]+", ");
		System.out.print(a[1][0]+", ");
		System.out.print(a[1][1]+", ");
		System.out.print(a[2][0]+", ");
		
		System.out.println("\n***** using for loop Multi Dimensional Array *****");
		
		for(int i=0; i<=a.length-1; i++) {
			for(int j=0; j<=a[i].length-1; j++) {
				System.out.print(a[i][j]+", ");
			}			
		}
		
		System.out.println("\n***** using while loop Multi Dimensional Array *****");
		
		int i =0;
		
		while(i<=a.length-1){
			int j=0;
			while(j<=a[i].length-1) {
				System.out.print(a[i][j]+", ");
				j++;
			}			
			i++;
		}
		
		System.out.println("\n***** using Do while Multi Dimensional Array *****");
		
		int i1 =0;		
		do{
			int j1 = 0;
			do {
				System.out.print(a[i1][j1]+", ");
				j1++;
			}while(j1<=a[i1].length-1);		
			i1++;
		}while(i1<=a.length-1);
		
		System.out.println("\n***** using for  loop Reverse Multi Dimensional Array *****");
		
		for (int i11=a.length-1; i11>=0;i11--) {
			for (int j=a[i11].length-1; j>=0;j--) {
				System.out.print(a[i11][j]+", ");
			}
		}
		System.out.println("\n***** using while loop Reverse Multi Dimensional Array *****");
		
		int i11 = a.length-1;
		
		while(i11>=0){
			int j=a[i11].length-1;
			while(j>=0) {
				System.out.print(a[i11][j]+", ");
				j--;
			}			
			i11--;
		}
		
		System.out.println("\n***** using Do while Reverse Multi Dimensional Array *****");
		
		int i111 =a.length-1;		
		do{
			int j1 = a[i111].length-1;
			do {
				System.out.print(a[i111][j1]+", ");
				j1--;
			}while(j1>=0);		
			i111--;
		}while(i111>=0);

		for(int[] x:a){
			System.out.print(x+", ");			
		}
	}

}
