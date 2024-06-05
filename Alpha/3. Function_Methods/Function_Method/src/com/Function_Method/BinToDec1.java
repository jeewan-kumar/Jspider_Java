package com.Function_Method;

import java.util.*;

public class BinToDec1 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.print("Enter you Binary numbers (0,1) : ");
		int l = scr.nextInt();
		System.out.println("Decimal value : "+dec(l));
	}
	public static int dec(int l) {
		int pow = 0;
		int dec = 0;
		
		while(l>=0) {
			int ld = l%10;
			dec = dec + (ld*(int)Math.pow(2, pow));
			pow++;
			l=l/10;
		}
		return dec;
	}
}
