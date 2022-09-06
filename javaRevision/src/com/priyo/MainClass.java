package com.priyo;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person();
		p1.age=24;
		p1.name="priyo";
		
		Person p2 =new Person();
		p2.name="biswa";
		p2.age=21;
		
		System.out.println(p1.age+" " +p1.name);
		
		
	}

}
class Person{//blueprint because i can make multiple person by creating object
	String name;
	int age;
	
}
