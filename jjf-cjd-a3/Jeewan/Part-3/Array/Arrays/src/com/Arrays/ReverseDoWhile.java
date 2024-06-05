package com.Arrays;

public class ReverseDoWhile {
	public static void main(String[] args) {
		int a[] = {5,8,55,65,88,65};
		int i=a.length-1;
		do{
			System.out.print(a[i]+", ");
			i--;
		}while(i>=0);
	}
}
