package com.test;

public class Drive1 {
	   public static void main(String[] args) throws NullPointerException {
	    try {
	        String []s = new String[10];
	        s=null;
	        s[0]="java";
	        System.out.println(s[0]);
	    }
	    catch(Exception e) {
	        System.out.println("E");
	    }
	   } 
	}

