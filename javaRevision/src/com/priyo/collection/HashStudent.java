package com.priyo.collection;

import java.util.HashSet;
import java.util.Set;

public class HashStudent {

	public static void main(String[] args) {
		Set<Student> hSet=new HashSet<>();
		
		
		hSet.add(new Student(1,"priyo"));
		hSet.add(new Student(3,"riyo"));
		hSet.add(new Student(8,"priya"));
		hSet.add(new Student(5,"tupu"));
		hSet.add(new Student(1,"priyo"));
		
		System.out.println(hSet);

	}

}
