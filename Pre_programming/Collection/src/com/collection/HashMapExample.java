package com.collection;

import java.util.HashMap;

public class HashMapExample {
	public static void main(String[] args) {
        // TreeMap Example
        HashMap<String, Integer> treeMap = new HashMap<>();
        treeMap.put("One", 1);
        treeMap.put("Two", 2);
        treeMap.put("Three", 3);

        System.out.println("TreeMap Elements:");
        for (String key : treeMap.keySet()) {
            System.out.println(key + ": " + treeMap.get(key));
        }
    }
}
