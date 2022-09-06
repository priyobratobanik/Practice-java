package com.priyo.collection;

import java.util.Stack;

public class EXStack {
//last in first out or first in last out
	public static void main(String[] args) {
		
		Stack<String> stack=new Stack<>();
		
		stack.push("subham");
		stack.push("priyo");
		stack.push("juli");
		
		System.out.println(stack);
		
		stack.add(2, "deepak");
		
		System.out.println(stack);
		
		System.out.println(stack.peek());
		
		stack.pop();
		
		System.out.println(stack);
		
		System.out.println(stack.firstElement());
		
		stack.forEach(e -> System.out.println(e));
		
		
		
		
		
		

	}

}
