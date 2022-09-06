package com.priyo.collection;

import java.util.Set;
import java.util.TreeSet;

public class EXTreeSet {

	public static void main(String[] args) {

		Set<Integer> set=new TreeSet<>();//will have distinct values 
		//in a sorted fashion
		//t.c O(log(n))
		
		
		set.add(250);
		set.add(398);
		set.add(2);
		set.add(100);
		set.add(2);
		
		System.out.println(set);
		
		
		
		

	}

}
