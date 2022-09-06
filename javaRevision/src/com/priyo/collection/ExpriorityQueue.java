package com.priyo.collection;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class ExpriorityQueue {

	public static void main(String[] args) {
		
		
		Queue<Integer> minpq=new PriorityQueue<>();
		//implementing mean heap
		
		Queue<Character> maxpq =new PriorityQueue<>(Comparator.reverseOrder());
		//implementing max heap
		
		minpq.offer(42);
		minpq.offer(1);
		minpq.offer(65);
		minpq.offer(9756);
		
		
		System.out.println(minpq);
		System.out.println(minpq.peek());
		System.out.println(minpq.poll());
		
		maxpq.offer('x');
		maxpq.offer('a');
		maxpq.offer('e');
		maxpq.offer('o');
		System.out.println(maxpq);
		
		
		System.out.println(maxpq.peek());
		
		System.out.println(maxpq);
		
		System.out.println(maxpq.poll());
		

	}

}
