//package com.Function_Method;

import java.util.Scanner;

public class BinToDec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter you Binary numbers (0,1) : ");
		long l = sc.nextLong();
		System.out.println("Decimal value : "+dec(l));
	}
	public static long dec(long l) {
		int pow = 0;
		long dec = 0;
		
		while(l>=0) {
			long ld = l%10;
			dec = dec + (ld*(int)Math.pow(2, pow));
			pow++;
			l=l/10;
		}
		return dec;
	}

}
