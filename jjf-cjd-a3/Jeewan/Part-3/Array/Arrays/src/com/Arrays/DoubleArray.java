package com.Arrays;

public class DoubleArray {
	public static void main(String[] args) {
				
		double a[] = {5,8,55,65.96,88,65.88};
		
		//IntArray a1[] = new IntArray();
		System.out.println("Array Reference: "+a);
		System.out.println("***** Manually Print *****");
		System.out.print(a[0]+", ");
		System.out.print(a[1]+", ");
		System.out.print(a[2]+", ");
		System.out.print(a[3]+", ");
		System.out.print(a[4]+", ");
		System.out.print(a[5]+", ");
		
		System.out.println("\n***** usint for loop *****");
		
		for(int i=0; i<=a.length-1; i++) {
			System.out.print(a[i]+", ");
		}
		
		System.out.println("\n***** usint while loop *****");
		
		int i =0;		
		while(i<=a.length-1){
			System.out.print(a[i]+", ");
			i++;
		}
		
		System.out.println("\n***** usint Do while loop *****");
		
		int i1 =0;		
		do{
			System.out.print(a[i1]+", ");
			i1++;
		}while(i1<=a.length-1);
	}
}
