package com.priyo.collection;

import java.util.LinkedList;
import java.util.Queue;

public class EXLinkedList {

	public static void main(String[] args) {
		
		Queue<Integer> queue=new LinkedList<>();
		//first in first out
		queue.offer(256);
		queue.offer(775);
		queue.offer(867);
		
		System.out.println(queue );
		
		
		System.out.println(queue.peek());
		
		System.out.println(queue.poll());
		
	}

}
