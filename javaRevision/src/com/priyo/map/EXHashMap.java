package com.priyo.map;


import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class EXHashMap {

	public static void main(String[] args) {
	
		Map<String, Integer> nums=new HashMap<>();//t.c O(1)
		
		//Map<String, Integer> treenums=new TreeMap<>();//tc O(logn)
		
		//if it is hashmap then keys are in a random fashion
		//if it is a treehashmap the keys are in a sorted fashion
		nums.put("ball", 65);
		nums.put("one", 1);
		nums.put("two", 2);
		nums.put("three", 3);
		nums.put("apple", 99);
		
		nums.remove("ball");
		
		
		//System.out.println(nums);
		
		/*
		 * if(!nums.containsKey("two")) { nums.put("two", 87); }
		 */
		
		//nums.put("two", 56);
		
		nums.putIfAbsent("two", 23);
		//System.out.println(nums);
		
		
		//printing
		
		for(Map.Entry<String, Integer> e: nums.entrySet()) {
			//System.out.println(e);
			
		//	System.out.println(e.getKey());
		//	System.out.println(e.getValue());
		}
//		
//		for(String key:nums.keySet() ) {
//			System.out.println(key);
//		}
//		
//		for(Integer value: nums.values()) {
//			System.out.println(value);
//		}
//		
//		System.out.println(nums.containsValue(23));
//		
//		System.out.println(nums.isEmpty());
		
//		System.out.println(nums.c());
		
		System.out.println(nums.get("three"));
		
		
		
	}

}
