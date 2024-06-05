package com.collection;

import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
        // TreeMap Example
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("One", 1);
        treeMap.put("Two", 2);
        treeMap.put("Three", 3);

        System.out.println("TreeMap Elements:");
        for (String key : treeMap.keySet()) {
            System.out.println(key + ": " + treeMap.get(key));
        }
    }
}
