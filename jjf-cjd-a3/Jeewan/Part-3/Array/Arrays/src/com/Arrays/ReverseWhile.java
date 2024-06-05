package com.Arrays;

public class ReverseWhile {
	public static void main(String[] args) {
		int a[] = {5,8,55,65,88,65};
		int i=a.length-1;
		while(i>=0){
			System.out.print(a[i]+", ");
			i--;
		}
	}
}
