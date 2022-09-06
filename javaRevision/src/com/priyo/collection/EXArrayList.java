package com.priyo.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class EXArrayList {

	public static void main(String[] args) {

//		ArrayList<String> studentsName=new ArrayList<>();

//		size=n
//			 n+n/2+1

//		
//		studentsName.add("priyo");
//		studentsName.add("biswa");
//		studentsName.add("raha");

//		List<Integer> list=new ArrayList<>();
		List<Integer> list = new LinkedList<>();// list is also implemented by linked list

		list.add(100);
		list.add(200);
		list.add(300);

		System.out.println(list);

		list.add(400);

		System.out.println(list);

		System.out.println(list.get(3));

		List<Integer> newlist = new ArrayList<>();

		newlist.add(1000);
		newlist.add(2000);

		list.addAll(newlist);

		System.out.println(list);

		list.add(3, 786);

		System.out.println(list);

		list.forEach(e -> System.out.println(e));

		list.remove(4);

		System.out.println(list);

		list.remove(Integer.valueOf(100));

		System.out.println(list);

//		list.clear();

		// tc-->O(n)//add or remove

		list.set(3, 99);

		System.out.println(list);

		System.out.println(list.contains(50));

		for (int i = 0; i < list.size(); i++) {
			System.out.println("for loop result" + list.get(i));
		}

		for (Integer eInteger : list) {
			System.out.println("lambda loop" + eInteger);
		}

		Iterator<Integer> iterator = list.iterator();

		while (iterator.hasNext()) {
			System.out.println("iterator loop" + iterator.next());
		}

	}

}
