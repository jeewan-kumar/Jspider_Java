package com.Exception;

public class Exception {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
			System.out.println("divide");
			
		} catch (ArithmeticException e) {
			System.out.println("number no valid");
		}
		System.out.println("try catch ");
		
	}
}
