package com.collection;

import java.util.Hashtable;

public class HashTableExample {
	 public static void main(String[] args) {
	        // Hashtable Example
	        Hashtable<String, Integer> hashtable = new Hashtable<>();
	        hashtable.put("One", 1);
	        hashtable.put("Two", 2);
	        hashtable.put("Three", 3);

	        System.out.println("Hashtable Elements:");
	        for (String key : hashtable.keySet()) {
	            System.out.println(key + ": " + hashtable.get(key));
	        }
	    }
}
