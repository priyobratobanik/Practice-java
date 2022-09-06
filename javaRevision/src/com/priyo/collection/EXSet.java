package com.priyo.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class EXSet {

	public static void main(String[] args) {
		Set<Integer> set=new HashSet<>();
		//tc-O(1)
		
		Set<Integer> newset=new LinkedHashSet<>();//has features of linked list and set 
		//set will have all distinct values
		
		newset.add(54);
		newset.add(98);
		newset.add(98);
		newset.add(43);
		
		System.out.println(newset);
		
		
		
		
		set.add(100);
		set.add(200);
		set.add(400);
		set.add(876);
		System.out.println(set);
		set.add(100);
		set.add(200);
		set.add(500);
		
		System.out.println(set);
		
		set.addAll(newset);
		
		System.out.println(set);
		
		
		System.out.println(set.contains(100));
		
		System.out.println(set.size());
		
		set.remove(500);
		
		System.out.println(set);
		
		
		
		

	}

}
