package com.multiple;

public class OlaDriv {
	public static void main(String[] args) {
//		Ola o = new Mini(); //upcasting
		Ola o = new Suv();
		System.out.println(o.cl);
		System.out.println(o.desti);
		//System.out.println(o.mprice);//cte
		
//		Mini m = (Mini) o;
//		System.out.println(m.cl);
//		System.out.println(m.desti);
//		System.out.println(m.mprice);
		
		
		Suv s = (Suv)o;
		System.out.println(s.cl);
		System.out.println(s.desti);
		System.out.println(s.sprice);
	}

}
