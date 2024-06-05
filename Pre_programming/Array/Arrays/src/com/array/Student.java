package com.array;

import java.util.Scanner;

public class Student {
	String name;
	int roll;
	public Student(String name, int roll) {
		this.name = name;
		this.roll = roll;
	}
	public static void main(String[] args) {
		Student s[] = new Student[5];
		s[0]= new Student("jeewan",755);
		s[1]=new Student("rohit",655);
		s[2]=new Student("ramu",855);
		s[3]=new Student("sohan",859);
		s[4]=new Student("ramu",854);
		System.out.println("Student name");
		for(Student p:s) {
			System.out.println("Name: "+p.name);
		}
		System.out.println("Student RollNo");
		for(Student p:s) {
			System.out.println("Roll no: "+p.roll);
		}
	}
	
	

}
