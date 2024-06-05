package com.collection;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
	public static void main(String[] args) {
        // LinkedHashMap Example
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("One", 1);
        linkedHashMap.put("Two", 2);
        linkedHashMap.put("Three", 3);

        System.out.println("LinkedHashMap Elements:");
        for (String key : linkedHashMap.keySet()) {
            System.out.println(key + ": " + linkedHashMap.get(key));
        }
    }
}