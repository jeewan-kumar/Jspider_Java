package com.collection;

import java.util.HashMap;
//import java.util.Set;
import java.util.Collection;
public class Homogenous {
	public static void main(String[] args) {
		HashMap h = new HashMap();
		h.put(1, "Jeewan");
		h.put(2,"Guddu");
		Collection c = h.values();
		for(Object i:c) {
			System.out.println(i);
		}
	}
}