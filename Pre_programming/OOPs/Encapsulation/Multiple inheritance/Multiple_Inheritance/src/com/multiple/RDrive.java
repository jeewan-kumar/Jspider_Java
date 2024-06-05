package com.multiple;

public class RDrive {
	public static void main(String[] args) {
		Rapid r = new Bike();
//		System.out.println(r.cl);
//		System.out.println(r.dis);
		//System.out.println(r.bPrice);
		
		Bike b = (Bike) r;
		System.out.println(b.cl);
		System.out.println(b.dis);
		System.out.println(b.bPrice);
	}
}
