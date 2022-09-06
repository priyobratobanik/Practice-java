package com.priyo.collection;

import java.util.ArrayDeque;

public class EXArrayDequeue {

	public static void main(String[] args) {
		ArrayDeque<Integer> adq=new ArrayDeque<>();
		//doublely queue
		//add or remove elements from front or back as well
		
		adq.offer(87);
		adq.offerFirst(100);
		adq.offerLast(876);
		adq.offer(54534);
		
		System.out.println(adq);
		
		
		System.out.println(adq.pollFirst());
		System.out.println(adq);
		
		System.out.println(adq.pollLast());
		System.out.println(adq);
		
		
		

	}

}
